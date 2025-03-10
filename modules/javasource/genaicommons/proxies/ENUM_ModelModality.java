// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package genaicommons.proxies;

public enum ENUM_ModelModality
{
	Text(new java.lang.String[][] { new java.lang.String[] { "en_US", "Text" } }),
	Embeddings(new java.lang.String[][] { new java.lang.String[] { "en_US", "Embeddings" } }),
	Image(new java.lang.String[][] { new java.lang.String[] { "en_US", "Image" } }),
	File(new java.lang.String[][] { new java.lang.String[] { "en_US", "File" } }),
	Audio(new java.lang.String[][] { new java.lang.String[] { "en_US", "Audio" } }),
	Video(new java.lang.String[][] { new java.lang.String[] { "en_US", "Video" } }),
	Other(new java.lang.String[][] { new java.lang.String[] { "en_US", "Other" } });

	private final java.util.Map<java.lang.String, java.lang.String> captions;

	private ENUM_ModelModality(java.lang.String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<>();
		for (java.lang.String[] captionString : captionStrings) {
			captions.put(captionString[0], captionString[1]);
		}
	}

	public java.lang.String getCaption(java.lang.String languageCode)
	{
		return captions.getOrDefault(languageCode, "en_US");
	}

	public java.lang.String getCaption()
	{
		return captions.get("en_US");
	}
}
