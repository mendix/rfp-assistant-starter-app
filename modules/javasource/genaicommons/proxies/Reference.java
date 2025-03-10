// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package genaicommons.proxies;

/**
 * An optional reference for a response message. This can point to external documents that contain data on which the generated response was based.
 */
public class Reference
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject referenceMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "GenAICommons.Reference";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Title("Title"),
		Content("Content"),
		Source("Source"),
		SourceType("SourceType"),
		_Index("_Index"),
		Reference_Citation("GenAICommons.Reference_Citation");

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

	public Reference(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Reference(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject referenceMendixObject)
	{
		if (referenceMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, referenceMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.referenceMendixObject = referenceMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Reference.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static genaicommons.proxies.Reference initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return genaicommons.proxies.Reference.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static genaicommons.proxies.Reference initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		if (com.mendix.core.Core.isSubClassOf("AmazonBedrockConnector.RetrievalResult", mendixObject.getType())) {
			return amazonbedrockconnector.proxies.RetrievalResult.initialize(context, mendixObject);
		}
		return new genaicommons.proxies.Reference(context, mendixObject);
	}

	public static genaicommons.proxies.Reference load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return genaicommons.proxies.Reference.initialize(context, mendixObject);
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
	 * @return value of Title
	 */
	public final java.lang.String getTitle()
	{
		return getTitle(getContext());
	}

	/**
	 * @param context
	 * @return value of Title
	 */
	public final java.lang.String getTitle(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Title.toString());
	}

	/**
	 * Set value of Title
	 * @param title
	 */
	public final void setTitle(java.lang.String title)
	{
		setTitle(getContext(), title);
	}

	/**
	 * Set value of Title
	 * @param context
	 * @param title
	 */
	public final void setTitle(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String title)
	{
		getMendixObject().setValue(context, MemberNames.Title.toString(), title);
	}

	/**
	 * @return value of Content
	 */
	public final java.lang.String getContent()
	{
		return getContent(getContext());
	}

	/**
	 * @param context
	 * @return value of Content
	 */
	public final java.lang.String getContent(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Content.toString());
	}

	/**
	 * Set value of Content
	 * @param content
	 */
	public final void setContent(java.lang.String content)
	{
		setContent(getContext(), content);
	}

	/**
	 * Set value of Content
	 * @param context
	 * @param content
	 */
	public final void setContent(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String content)
	{
		getMendixObject().setValue(context, MemberNames.Content.toString(), content);
	}

	/**
	 * @return value of Source
	 */
	public final java.lang.String getSource()
	{
		return getSource(getContext());
	}

	/**
	 * @param context
	 * @return value of Source
	 */
	public final java.lang.String getSource(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Source.toString());
	}

	/**
	 * Set value of Source
	 * @param source
	 */
	public final void setSource(java.lang.String source)
	{
		setSource(getContext(), source);
	}

	/**
	 * Set value of Source
	 * @param context
	 * @param source
	 */
	public final void setSource(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String source)
	{
		getMendixObject().setValue(context, MemberNames.Source.toString(), source);
	}

	/**
	 * Set value of SourceType
	 * @param sourcetype
	 */
	public final genaicommons.proxies.ENUM_SourceType getSourceType()
	{
		return getSourceType(getContext());
	}

	/**
	 * @param context
	 * @return value of SourceType
	 */
	public final genaicommons.proxies.ENUM_SourceType getSourceType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.SourceType.toString());
		if (obj == null) {
			return null;
		}
		return genaicommons.proxies.ENUM_SourceType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of SourceType
	 * @param sourcetype
	 */
	public final void setSourceType(genaicommons.proxies.ENUM_SourceType sourcetype)
	{
		setSourceType(getContext(), sourcetype);
	}

	/**
	 * Set value of SourceType
	 * @param context
	 * @param sourcetype
	 */
	public final void setSourceType(com.mendix.systemwideinterfaces.core.IContext context, genaicommons.proxies.ENUM_SourceType sourcetype)
	{
		if (sourcetype != null) {
			getMendixObject().setValue(context, MemberNames.SourceType.toString(), sourcetype.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.SourceType.toString(), null);
		}
	}

	/**
	 * @return value of _Index
	 */
	public final java.lang.Integer get_Index()
	{
		return get_Index(getContext());
	}

	/**
	 * @param context
	 * @return value of _Index
	 */
	public final java.lang.Integer get_Index(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames._Index.toString());
	}

	/**
	 * Set value of _Index
	 * @param _index
	 */
	public final void set_Index(java.lang.Integer _index)
	{
		set_Index(getContext(), _index);
	}

	/**
	 * Set value of _Index
	 * @param context
	 * @param _index
	 */
	public final void set_Index(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer _index)
	{
		getMendixObject().setValue(context, MemberNames._Index.toString(), _index);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Reference_Citation
	 */
	public final java.util.List<genaicommons.proxies.Citation> getReference_Citation() throws com.mendix.core.CoreException
	{
		return getReference_Citation(getContext());
	}

	/**
	 * @param context
	 * @return value of Reference_Citation
	 * @throws com.mendix.core.CoreException
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<genaicommons.proxies.Citation> getReference_Citation(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<genaicommons.proxies.Citation> result = new java.util.ArrayList<>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.Reference_Citation.toString());
		if (valueObject == null) {
			return result;
		}
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject)) {
			result.add(genaicommons.proxies.Citation.initialize(context, mendixObject));
		}
		return result;
	}

	/**
	 * Set value of Reference_Citation
	 * @param reference_citation
	 */
	public final void setReference_Citation(java.util.List<genaicommons.proxies.Citation> reference_citation)
	{
		setReference_Citation(getContext(), reference_citation);
	}

	/**
	 * Set value of Reference_Citation
	 * @param context
	 * @param reference_citation
	 */
	public final void setReference_Citation(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<genaicommons.proxies.Citation> reference_citation)
	{
		var identifiers = reference_citation
			.stream()
			.map(proxyObject -> proxyObject.getMendixObject().getId())
			.collect(java.util.stream.Collectors.toList());
		
		getMendixObject().setValue(context, MemberNames.Reference_Citation.toString(), identifiers);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return referenceMendixObject;
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
			final genaicommons.proxies.Reference that = (genaicommons.proxies.Reference) obj;
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
