package md5e9433341a90981e0103ac73fe81d7e26;


public class GridViewHolder
	extends android.support.v7.widget.RecyclerView.ViewHolder
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("MobileTemplate.Android.FastGrid.GridViewHolder, MobileTemplate.Android", GridViewHolder.class, __md_methods);
	}


	public GridViewHolder (android.view.View p0)
	{
		super (p0);
		if (getClass () == GridViewHolder.class)
			mono.android.TypeManager.Activate ("MobileTemplate.Android.FastGrid.GridViewHolder, MobileTemplate.Android", "Android.Views.View, Mono.Android", this, new java.lang.Object[] { p0 });
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
