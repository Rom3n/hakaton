package md5e9433341a90981e0103ac73fe81d7e26;


public class HorizontalSpacesItemDecoration
	extends android.support.v7.widget.RecyclerView.ItemDecoration
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getItemOffsets:(Landroid/graphics/Rect;Landroid/view/View;Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$State;)V:GetGetItemOffsets_Landroid_graphics_Rect_Landroid_view_View_Landroid_support_v7_widget_RecyclerView_Landroid_support_v7_widget_RecyclerView_State_Handler\n" +
			"";
		mono.android.Runtime.register ("MobileTemplate.Android.FastGrid.HorizontalSpacesItemDecoration, MobileTemplate.Android", HorizontalSpacesItemDecoration.class, __md_methods);
	}


	public HorizontalSpacesItemDecoration ()
	{
		super ();
		if (getClass () == HorizontalSpacesItemDecoration.class)
			mono.android.TypeManager.Activate ("MobileTemplate.Android.FastGrid.HorizontalSpacesItemDecoration, MobileTemplate.Android", "", this, new java.lang.Object[] {  });
	}

	public HorizontalSpacesItemDecoration (int p0, int p1)
	{
		super ();
		if (getClass () == HorizontalSpacesItemDecoration.class)
			mono.android.TypeManager.Activate ("MobileTemplate.Android.FastGrid.HorizontalSpacesItemDecoration, MobileTemplate.Android", "System.Int32, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1 });
	}


	public void getItemOffsets (android.graphics.Rect p0, android.view.View p1, android.support.v7.widget.RecyclerView p2, android.support.v7.widget.RecyclerView.State p3)
	{
		n_getItemOffsets (p0, p1, p2, p3);
	}

	private native void n_getItemOffsets (android.graphics.Rect p0, android.view.View p1, android.support.v7.widget.RecyclerView p2, android.support.v7.widget.RecyclerView.State p3);

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
