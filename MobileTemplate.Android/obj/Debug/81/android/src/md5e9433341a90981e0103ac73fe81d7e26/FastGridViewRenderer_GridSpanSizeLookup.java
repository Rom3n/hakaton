package md5e9433341a90981e0103ac73fe81d7e26;


public class FastGridViewRenderer_GridSpanSizeLookup
	extends android.support.v7.widget.GridLayoutManager.SpanSizeLookup
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getSpanSize:(I)I:GetGetSpanSize_IHandler\n" +
			"";
		mono.android.Runtime.register ("MobileTemplate.Android.FastGrid.FastGridViewRenderer+GridSpanSizeLookup, MobileTemplate.Android", FastGridViewRenderer_GridSpanSizeLookup.class, __md_methods);
	}


	public FastGridViewRenderer_GridSpanSizeLookup ()
	{
		super ();
		if (getClass () == FastGridViewRenderer_GridSpanSizeLookup.class)
			mono.android.TypeManager.Activate ("MobileTemplate.Android.FastGrid.FastGridViewRenderer+GridSpanSizeLookup, MobileTemplate.Android", "", this, new java.lang.Object[] {  });
	}


	public int getSpanSize (int p0)
	{
		return n_getSpanSize (p0);
	}

	private native int n_getSpanSize (int p0);

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
