package md5e9433341a90981e0103ac73fe81d7e26;


public class ScrollRecyclerView
	extends android.support.v7.widget.RecyclerView
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("MobileTemplate.Android.FastGrid.ScrollRecyclerView, MobileTemplate.Android", ScrollRecyclerView.class, __md_methods);
	}


	public ScrollRecyclerView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == ScrollRecyclerView.class)
			mono.android.TypeManager.Activate ("MobileTemplate.Android.FastGrid.ScrollRecyclerView, MobileTemplate.Android", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public ScrollRecyclerView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == ScrollRecyclerView.class)
			mono.android.TypeManager.Activate ("MobileTemplate.Android.FastGrid.ScrollRecyclerView, MobileTemplate.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public ScrollRecyclerView (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == ScrollRecyclerView.class)
			mono.android.TypeManager.Activate ("MobileTemplate.Android.FastGrid.ScrollRecyclerView, MobileTemplate.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
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
