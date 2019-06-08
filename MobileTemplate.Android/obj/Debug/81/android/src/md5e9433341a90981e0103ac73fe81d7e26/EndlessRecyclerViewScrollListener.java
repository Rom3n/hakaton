package md5e9433341a90981e0103ac73fe81d7e26;


public class EndlessRecyclerViewScrollListener
	extends android.support.v7.widget.RecyclerView.OnScrollListener
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onScrollStateChanged:(Landroid/support/v7/widget/RecyclerView;I)V:GetOnScrollStateChanged_Landroid_support_v7_widget_RecyclerView_IHandler\n" +
			"n_onScrolled:(Landroid/support/v7/widget/RecyclerView;II)V:GetOnScrolled_Landroid_support_v7_widget_RecyclerView_IIHandler\n" +
			"";
		mono.android.Runtime.register ("MobileTemplate.Android.FastGrid.EndlessRecyclerViewScrollListener, MobileTemplate.Android", EndlessRecyclerViewScrollListener.class, __md_methods);
	}


	public EndlessRecyclerViewScrollListener ()
	{
		super ();
		if (getClass () == EndlessRecyclerViewScrollListener.class)
			mono.android.TypeManager.Activate ("MobileTemplate.Android.FastGrid.EndlessRecyclerViewScrollListener, MobileTemplate.Android", "", this, new java.lang.Object[] {  });
	}


	public void onScrollStateChanged (android.support.v7.widget.RecyclerView p0, int p1)
	{
		n_onScrollStateChanged (p0, p1);
	}

	private native void n_onScrollStateChanged (android.support.v7.widget.RecyclerView p0, int p1);


	public void onScrolled (android.support.v7.widget.RecyclerView p0, int p1, int p2)
	{
		n_onScrolled (p0, p1, p2);
	}

	private native void n_onScrolled (android.support.v7.widget.RecyclerView p0, int p1, int p2);

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
