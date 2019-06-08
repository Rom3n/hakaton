package md581952797b70fab8fa3af9fb4942b7c8e;


public class ViewCellProperties
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("MyWasteMobile.Android.FastGrid.ViewCellProperties, MobileTemplate.Android", ViewCellProperties.class, __md_methods);
	}


	public ViewCellProperties ()
	{
		super ();
		if (getClass () == ViewCellProperties.class)
			mono.android.TypeManager.Activate ("MyWasteMobile.Android.FastGrid.ViewCellProperties, MobileTemplate.Android", "", this, new java.lang.Object[] {  });
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
