// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package genaicommons.proxies;

/**
 * This entity represents usage statistics of a call to an LLM. It refers to a complete LLM interaction; in case there are several iterations (e.g. recursive procesisng of function calls), everything should be aggregated into one Usage record.
 * 
 * Following the principles of GenAI Commons it must be stored based on the response for every successful call to a system of an LLM provider. This is only applicable for text & files operations and embeddings operations. It is the responsibility of connector developers implementing the GenAI principles in their GenAI operations to include the right microflows to ensure storage of Usage details after successful calls.
 * 
 * The data stored in this entity is to be used later on for monitoring purposes.
 * 
 * See ScE_Usage_Cleanup and Usage_CleanUpAterDays for more information about automatic cleanup.
 */
public class Usage
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject usageMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "GenAICommons.Usage";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Architecture("Architecture"),
		DeployedModelDisplayName("DeployedModelDisplayName"),
		InputTokens("InputTokens"),
		OutputTokens("OutputTokens"),
		TotalTokens("TotalTokens"),
		DurationMilliseconds("DurationMilliseconds"),
		_DeploymentIdentifier("_DeploymentIdentifier"),
		Usage_DeployedModel("GenAICommons.Usage_DeployedModel");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Usage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Usage(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject usageMendixObject)
	{
		if (usageMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, usageMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.usageMendixObject = usageMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Usage.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static genaicommons.proxies.Usage initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return genaicommons.proxies.Usage.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static genaicommons.proxies.Usage initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new genaicommons.proxies.Usage(context, mendixObject);
	}

	public static genaicommons.proxies.Usage load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return genaicommons.proxies.Usage.initialize(context, mendixObject);
	}

	public static java.util.List<genaicommons.proxies.Usage> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> genaicommons.proxies.Usage.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * Commit the changes made on this proxy object.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Architecture
	 */
	public final java.lang.String getArchitecture()
	{
		return getArchitecture(getContext());
	}

	/**
	 * @param context
	 * @return value of Architecture
	 */
	public final java.lang.String getArchitecture(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Architecture.toString());
	}

	/**
	 * Set value of Architecture
	 * @param architecture
	 */
	public final void setArchitecture(java.lang.String architecture)
	{
		setArchitecture(getContext(), architecture);
	}

	/**
	 * Set value of Architecture
	 * @param context
	 * @param architecture
	 */
	public final void setArchitecture(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String architecture)
	{
		getMendixObject().setValue(context, MemberNames.Architecture.toString(), architecture);
	}

	/**
	 * @return value of DeployedModelDisplayName
	 */
	public final java.lang.String getDeployedModelDisplayName()
	{
		return getDeployedModelDisplayName(getContext());
	}

	/**
	 * @param context
	 * @return value of DeployedModelDisplayName
	 */
	public final java.lang.String getDeployedModelDisplayName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.DeployedModelDisplayName.toString());
	}

	/**
	 * Set value of DeployedModelDisplayName
	 * @param deployedmodeldisplayname
	 */
	public final void setDeployedModelDisplayName(java.lang.String deployedmodeldisplayname)
	{
		setDeployedModelDisplayName(getContext(), deployedmodeldisplayname);
	}

	/**
	 * Set value of DeployedModelDisplayName
	 * @param context
	 * @param deployedmodeldisplayname
	 */
	public final void setDeployedModelDisplayName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String deployedmodeldisplayname)
	{
		getMendixObject().setValue(context, MemberNames.DeployedModelDisplayName.toString(), deployedmodeldisplayname);
	}

	/**
	 * @return value of InputTokens
	 */
	public final java.lang.Integer getInputTokens()
	{
		return getInputTokens(getContext());
	}

	/**
	 * @param context
	 * @return value of InputTokens
	 */
	public final java.lang.Integer getInputTokens(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.InputTokens.toString());
	}

	/**
	 * Set value of InputTokens
	 * @param inputtokens
	 */
	public final void setInputTokens(java.lang.Integer inputtokens)
	{
		setInputTokens(getContext(), inputtokens);
	}

	/**
	 * Set value of InputTokens
	 * @param context
	 * @param inputtokens
	 */
	public final void setInputTokens(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer inputtokens)
	{
		getMendixObject().setValue(context, MemberNames.InputTokens.toString(), inputtokens);
	}

	/**
	 * @return value of OutputTokens
	 */
	public final java.lang.Integer getOutputTokens()
	{
		return getOutputTokens(getContext());
	}

	/**
	 * @param context
	 * @return value of OutputTokens
	 */
	public final java.lang.Integer getOutputTokens(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.OutputTokens.toString());
	}

	/**
	 * Set value of OutputTokens
	 * @param outputtokens
	 */
	public final void setOutputTokens(java.lang.Integer outputtokens)
	{
		setOutputTokens(getContext(), outputtokens);
	}

	/**
	 * Set value of OutputTokens
	 * @param context
	 * @param outputtokens
	 */
	public final void setOutputTokens(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer outputtokens)
	{
		getMendixObject().setValue(context, MemberNames.OutputTokens.toString(), outputtokens);
	}

	/**
	 * @return value of TotalTokens
	 */
	public final java.lang.Integer getTotalTokens()
	{
		return getTotalTokens(getContext());
	}

	/**
	 * @param context
	 * @return value of TotalTokens
	 */
	public final java.lang.Integer getTotalTokens(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.TotalTokens.toString());
	}

	/**
	 * Set value of TotalTokens
	 * @param totaltokens
	 */
	public final void setTotalTokens(java.lang.Integer totaltokens)
	{
		setTotalTokens(getContext(), totaltokens);
	}

	/**
	 * Set value of TotalTokens
	 * @param context
	 * @param totaltokens
	 */
	public final void setTotalTokens(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer totaltokens)
	{
		getMendixObject().setValue(context, MemberNames.TotalTokens.toString(), totaltokens);
	}

	/**
	 * @return value of DurationMilliseconds
	 */
	public final java.lang.Integer getDurationMilliseconds()
	{
		return getDurationMilliseconds(getContext());
	}

	/**
	 * @param context
	 * @return value of DurationMilliseconds
	 */
	public final java.lang.Integer getDurationMilliseconds(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.DurationMilliseconds.toString());
	}

	/**
	 * Set value of DurationMilliseconds
	 * @param durationmilliseconds
	 */
	public final void setDurationMilliseconds(java.lang.Integer durationmilliseconds)
	{
		setDurationMilliseconds(getContext(), durationmilliseconds);
	}

	/**
	 * Set value of DurationMilliseconds
	 * @param context
	 * @param durationmilliseconds
	 */
	public final void setDurationMilliseconds(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer durationmilliseconds)
	{
		getMendixObject().setValue(context, MemberNames.DurationMilliseconds.toString(), durationmilliseconds);
	}

	/**
	 * @return value of _DeploymentIdentifier
	 */
	public final java.lang.String get_DeploymentIdentifier()
	{
		return get_DeploymentIdentifier(getContext());
	}

	/**
	 * @param context
	 * @return value of _DeploymentIdentifier
	 */
	public final java.lang.String get_DeploymentIdentifier(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames._DeploymentIdentifier.toString());
	}

	/**
	 * Set value of _DeploymentIdentifier
	 * @param _deploymentidentifier
	 */
	public final void set_DeploymentIdentifier(java.lang.String _deploymentidentifier)
	{
		set_DeploymentIdentifier(getContext(), _deploymentidentifier);
	}

	/**
	 * Set value of _DeploymentIdentifier
	 * @param context
	 * @param _deploymentidentifier
	 */
	public final void set_DeploymentIdentifier(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String _deploymentidentifier)
	{
		getMendixObject().setValue(context, MemberNames._DeploymentIdentifier.toString(), _deploymentidentifier);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Usage_DeployedModel
	 */
	public final genaicommons.proxies.DeployedModel getUsage_DeployedModel() throws com.mendix.core.CoreException
	{
		return getUsage_DeployedModel(getContext());
	}

	/**
	 * @param context
	 * @return value of Usage_DeployedModel
	 * @throws com.mendix.core.CoreException
	 */
	public final genaicommons.proxies.DeployedModel getUsage_DeployedModel(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		genaicommons.proxies.DeployedModel result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Usage_DeployedModel.toString());
		if (identifier != null) {
			result = genaicommons.proxies.DeployedModel.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Usage_DeployedModel
	 * @param usage_deployedmodel
	 */
	public final void setUsage_DeployedModel(genaicommons.proxies.DeployedModel usage_deployedmodel)
	{
		setUsage_DeployedModel(getContext(), usage_deployedmodel);
	}

	/**
	 * Set value of Usage_DeployedModel
	 * @param context
	 * @param usage_deployedmodel
	 */
	public final void setUsage_DeployedModel(com.mendix.systemwideinterfaces.core.IContext context, genaicommons.proxies.DeployedModel usage_deployedmodel)
	{
		if (usage_deployedmodel == null) {
			getMendixObject().setValue(context, MemberNames.Usage_DeployedModel.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Usage_DeployedModel.toString(), usage_deployedmodel.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return usageMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final genaicommons.proxies.Usage that = (genaicommons.proxies.Usage) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return entityName;
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
