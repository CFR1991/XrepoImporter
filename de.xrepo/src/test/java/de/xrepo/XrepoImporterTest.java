package de.xrepo;

import java.io.File;

import javax.xml.bind.JAXB;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.oasis_open.docs.codelist.ns.genericode._1.CodeListDocument;

public class XrepoImporterTest {

	@Test
	public void xrepoImporterTest() {
		// arrange
		XrepoImporter imp = new XrepoImporter();
		// act
		boolean theBool = imp.importGerichteListFromXrepoXml();
		// assert
		Assert.assertTrue(theBool);
	}

	@Test
	public void xrepoImporterTestFile() {
		// arrange
		CodeListDocument o = JAXB.unmarshal(
				new File("C:\\Users\\fried\\Desktop\\ws0112\\de.xrepo\\src\\main\\resources\\gericht.xml"),
				CodeListDocument.class);
		// act
		boolean theBool = o.getAnnotation()!=null;
		// assert
		Assert.assertTrue(theBool);
	}

}
