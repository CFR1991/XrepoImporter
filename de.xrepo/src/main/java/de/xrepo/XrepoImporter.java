package de.xrepo;

import java.util.ArrayList;
import java.util.List;

import org.oasis_open.docs.codelist.ns.genericode._1.CodeListDocument;
import org.oasis_open.docs.codelist.ns.genericode._1.Column;
import org.oasis_open.docs.codelist.ns.genericode._1.Row;
import org.oasis_open.docs.codelist.ns.genericode._1.SimpleCodeList;
import org.oasis_open.docs.codelist.ns.genericode._1.Value;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;

public class XrepoImporter {
	private final static String url_String = "https://www.xrepository.de";
	private ExchangeStrategies e = ExchangeStrategies.builder()
			.codecs(configurer -> configurer.defaultCodecs().maxInMemorySize(16 * 1024 * 1024)).build();
	private final WebClient client = WebClient.builder().baseUrl(url_String).exchangeStrategies(e).build();

	public boolean importGerichteListFromXrepoXml() {
		String path2 = "/api/xrepository/version_codeliste/urn:xoev-de:xjustiz:codeliste:gds.gerichte_3.3/genericode";
		CodeListDocument resp2 = client.get().uri(path2).retrieve().bodyToMono(CodeListDocument.class).block();
		List<Gericht> gerichteList = getGerichteListFromCodeListDoc(resp2);
		return gerichteList != null && gerichteList.size() > 1;
	}

	private List<Gericht> getGerichteListFromCodeListDoc(CodeListDocument resp2) {
		SimpleCodeList list = resp2.getSimpleCodeList();
		List<Gericht> gerichteList = new ArrayList<>();
		for (Row row : list.getRow()) {
			Gericht gericht = new Gericht();
			for (Value val : row.getValue()) {
				Column ref = (Column) val.getColumnRef();
				String id = ref.getId();
				if (id.equals("code")) {
					gericht.setCode(val.getSimpleValue().getValue());
					continue;
				}
				if (id.equals("wert")) {
					gericht.setWert(val.getSimpleValue().getValue());
					continue;
				}
				return null;
			}
			gerichteList.add(gericht);
		}
		System.out.println(gerichteList.size() + " Gerichte heruntergeladen");
		return gerichteList;
	}
}
