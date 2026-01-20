package designpattern.creationaldesign.factorydesign;

/**
 * FactoryMethodPatternEx03.java
 * Created by Navneet Malva on 16/01/26 : 14:41.
 */

interface DocumentService {
  String createDocs();
}

class EnglishDocsService implements DocumentService {
  @Override
  public String createDocs() {
    return "{ \"title\": \"Hello\", \"body\": \"Welcome to English Docs\" }";
  }
}

class FrenchDocsService implements DocumentService {
  @Override
  public String createDocs() {
    return "{ \"title\": \"Bonjour\", \"body\": \"Bienvenue aux documents Français\" }";
  }
}

class DocumentFactory {

  public static DocumentService createDocumentService(String language) {

    if (language == null) {
      throw new IllegalArgumentException("Language cannot be null");
    }

    String lang = language.trim().toLowerCase();

    if (lang.equals("en")) {
      return new EnglishDocsService();
    } else if (lang.equals("fr")) {
      return new FrenchDocsService();
    } else {
      throw new UnsupportedOperationException("Language not supported: " + language);
    }
  }
}

class FactoryMethodPatternEx03 {
  public static void main(String[] args) {

    DocumentService doc = DocumentFactory.createDocumentService("fr");
    System.out.println(doc.createDocs());

    DocumentService doc2 = DocumentFactory.createDocumentService("en");
    System.out.println(doc2.createDocs());
  }
}

