// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package genaicommons.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * Adds a new KnowledgeBaseChunk to the ChunkCollection to create the input for embeddings or knowledge base operations.
 * Optionally, add a MetadataCollection for more advanced filtering.
 * 
 * Please check the documentation for each parameter for more detailed information on how to use this operation in your project.
 */
public class ChunkCollection_AddKnowledgeBaseChunk extends CustomJavaAction<IMendixObject>
{
	private IMendixObject __ChunkCollection;
	private genaicommons.proxies.ChunkCollection ChunkCollection;
	private java.lang.String InputText;
	private java.lang.String HumanReadableID;
	private IMendixObject MxObject;
	private IMendixObject __MetadataCollection;
	private genaicommons.proxies.MetadataCollection MetadataCollection;

	public ChunkCollection_AddKnowledgeBaseChunk(IContext context, IMendixObject ChunkCollection, java.lang.String InputText, java.lang.String HumanReadableID, IMendixObject MxObject, IMendixObject MetadataCollection)
	{
		super(context);
		this.__ChunkCollection = ChunkCollection;
		this.InputText = InputText;
		this.HumanReadableID = HumanReadableID;
		this.MxObject = MxObject;
		this.__MetadataCollection = MetadataCollection;
	}

	@java.lang.Override
	public IMendixObject executeAction() throws Exception
	{
		this.ChunkCollection = this.__ChunkCollection == null ? null : genaicommons.proxies.ChunkCollection.initialize(getContext(), __ChunkCollection);

		this.MetadataCollection = this.__MetadataCollection == null ? null : genaicommons.proxies.MetadataCollection.initialize(getContext(), __MetadataCollection);

		// BEGIN USER CODE
		throw new com.mendix.systemwideinterfaces.MendixRuntimeException("Java action was not implemented");
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "ChunkCollection_AddKnowledgeBaseChunk";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
