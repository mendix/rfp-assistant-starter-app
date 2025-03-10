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

public class Request_AddKnowledgeBaseRetrieval extends CustomJavaAction<IMendixObject>
{
	private IMendixObject __Request;
	private genaicommons.proxies.Request Request;
	private java.lang.String ToolName;
	private java.lang.String RetrieveMicroflow;
	private IMendixObject __Connection;
	private genaicommons.proxies.Connection Connection;
	private java.lang.String ToolDescription;
	private IMendixObject __MetadataCollection;
	private genaicommons.proxies.MetadataCollection MetadataCollection;
	private java.math.BigDecimal MinimumSimilarity;
	private java.lang.Long MaxNumberOfResults;

	public Request_AddKnowledgeBaseRetrieval(IContext context, IMendixObject Request, java.lang.String ToolName, java.lang.String RetrieveMicroflow, IMendixObject Connection, java.lang.String ToolDescription, IMendixObject MetadataCollection, java.math.BigDecimal MinimumSimilarity, java.lang.Long MaxNumberOfResults)
	{
		super(context);
		this.__Request = Request;
		this.ToolName = ToolName;
		this.RetrieveMicroflow = RetrieveMicroflow;
		this.__Connection = Connection;
		this.ToolDescription = ToolDescription;
		this.__MetadataCollection = MetadataCollection;
		this.MinimumSimilarity = MinimumSimilarity;
		this.MaxNumberOfResults = MaxNumberOfResults;
	}

	@java.lang.Override
	public IMendixObject executeAction() throws Exception
	{
		this.Request = this.__Request == null ? null : genaicommons.proxies.Request.initialize(getContext(), __Request);

		this.Connection = this.__Connection == null ? null : genaicommons.proxies.Connection.initialize(getContext(), __Connection);

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
		return "Request_AddKnowledgeBaseRetrieval";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
