package md5e9433341a90981e0103ac73fe81d7e26;


public class SwipeRefreshLayoutWithDisabling
	extends android.support.v4.widget.SwipeRefreshLayout
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_canChildScrollUp:()Z:GetCanChildScrollUpHandler\n" +
			"";
		mono.android.Runtime.register ("MobileTemplate.Android.FastGrid.SwipeRefreshLayoutWithDisabling, MobileTemplate.Android", SwipeRefreshLayoutWithDisabling.class, __md_methods);
	}


	public SwipeRefreshLayoutWithDisabling (android.content.Context p0)
	{
		super (p0);
		if (getClass () == SwipeRefreshLayoutWithDisabling.class)
			mono.android.TypeManager.Activate ("MobileTemplate.Android.FastGrid.SwipeRefreshLayoutWithDisabling, MobileTemplate.Android", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public SwipeRefreshLayoutWithDisabling (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == SwipeRefreshLayoutWithDisabling.class)
			mono.android.TypeManager.Activate ("MobileTemplate.Android.FastGrid.SwipeRefreshLayoutWithDisabling, MobileTemplate.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public boolean canChildScrollUp ()
	{
		return n_canChildScrollUp ();
	}

	private native boolean n_canChildScrollUp ();

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
