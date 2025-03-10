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
 * Creates a DeployedModel object (or a specialization of such if the specialization is passed) and sets all passed attributes. The DeployedModel entity replaces the Connection entity and is a required input parameter for all chat completion operations. It contains the name of the microflow to be executed for the specified model and other information relevant to connect to a model.
 */
public class DeployedModel_Create extends CustomJavaAction<IMendixObject>
{
	private java.lang.String DisplayName;
	private java.lang.String Architecture;
	private java.lang.String Model;
	private genaicommons.proxies.ENUM_ModelModality OutputModality;
	private java.lang.String Microflow;
	private java.lang.String DeployedModelSpecialization;
	private java.util.List<IMendixObject> __InputModalityList;
	private java.util.List<genaicommons.proxies.InputModality> InputModalityList;
	private genaicommons.proxies.ENUM_ModelSupport SupportsSystemPrompt;
	private genaicommons.proxies.ENUM_ModelSupport SupportsFunctionCalling;
	private genaicommons.proxies.ENUM_ModelSupport SupportsConversationsWithHistory;

	public DeployedModel_Create(IContext context, java.lang.String DisplayName, java.lang.String Architecture, java.lang.String Model, java.lang.String OutputModality, java.lang.String Microflow, java.lang.String DeployedModelSpecialization, java.util.List<IMendixObject> InputModalityList, java.lang.String SupportsSystemPrompt, java.lang.String SupportsFunctionCalling, java.lang.String SupportsConversationsWithHistory)
	{
		super(context);
		this.DisplayName = DisplayName;
		this.Architecture = Architecture;
		this.Model = Model;
		this.OutputModality = OutputModality == null ? null : genaicommons.proxies.ENUM_ModelModality.valueOf(OutputModality);
		this.Microflow = Microflow;
		this.DeployedModelSpecialization = DeployedModelSpecialization;
		this.__InputModalityList = InputModalityList;
		this.SupportsSystemPrompt = SupportsSystemPrompt == null ? null : genaicommons.proxies.ENUM_ModelSupport.valueOf(SupportsSystemPrompt);
		this.SupportsFunctionCalling = SupportsFunctionCalling == null ? null : genaicommons.proxies.ENUM_ModelSupport.valueOf(SupportsFunctionCalling);
		this.SupportsConversationsWithHistory = SupportsConversationsWithHistory == null ? null : genaicommons.proxies.ENUM_ModelSupport.valueOf(SupportsConversationsWithHistory);
	}

	@java.lang.Override
	public IMendixObject executeAction() throws Exception
	{
		this.InputModalityList = java.util.Optional.ofNullable(this.__InputModalityList)
			.orElse(java.util.Collections.emptyList())
			.stream()
			.map(__InputModalityListElement -> genaicommons.proxies.InputModality.initialize(getContext(), __InputModalityListElement))
			.collect(java.util.stream.Collectors.toList());

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
		return "DeployedModel_Create";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
