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
 * Adds a new Function to a Request.
 * Parameters: 
 * - Request: The request to add the function to.
 * - ToolName: The name of the tool to call.
 * - FunctionMicroflow: The microflow that is called within this function.
 * - ToolDescription (optional): A description of what the function does, used by the model to choose when and how to call the function.
 * 
 * The action returns empty if adding the function was not successful (errors are logged).
 */
public class Request_AddFunction extends CustomJavaAction<IMendixObject>
{
	private IMendixObject __Request;
	private genaicommons.proxies.Request Request;
	private java.lang.String ToolName;
	private java.lang.String ToolDescription;
	private java.lang.String FunctionMicroflow;

	public Request_AddFunction(IContext context, IMendixObject Request, java.lang.String ToolName, java.lang.String ToolDescription, java.lang.String FunctionMicroflow)
	{
		super(context);
		this.__Request = Request;
		this.ToolName = ToolName;
		this.ToolDescription = ToolDescription;
		this.FunctionMicroflow = FunctionMicroflow;
	}

	@java.lang.Override
	public IMendixObject executeAction() throws Exception
	{
		this.Request = this.__Request == null ? null : genaicommons.proxies.Request.initialize(getContext(), __Request);

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
		return "Request_AddFunction";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
