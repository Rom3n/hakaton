package md5e9433341a90981e0103ac73fe81d7e26;


public class SmoothGridLayoutManager
	extends android.support.v7.widget.GridLayoutManager
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_smoothScrollToPosition:(Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$State;I)V:GetSmoothScrollToPosition_Landroid_support_v7_widget_RecyclerView_Landroid_support_v7_widget_RecyclerView_State_IHandler\n" +
			"n_computeVerticalScrollOffset:(Landroid/support/v7/widget/RecyclerView$State;)I:GetComputeVerticalScrollOffset_Landroid_support_v7_widget_RecyclerView_State_Handler\n" +
			"";
		mono.android.Runtime.register ("MobileTemplate.Android.FastGrid.SmoothGridLayoutManager, MobileTemplate.Android", SmoothGridLayoutManager.class, __md_methods);
	}


	public SmoothGridLayoutManager (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == SmoothGridLayoutManager.class)
			mono.android.TypeManager.Activate ("MobileTemplate.Android.FastGrid.SmoothGridLayoutManager, MobileTemplate.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public SmoothGridLayoutManager (android.content.Context p0, int p1)
	{
		super (p0, p1);
		if (getClass () == SmoothGridLayoutManager.class)
			mono.android.TypeManager.Activate ("MobileTemplate.Android.FastGrid.SmoothGridLayoutManager, MobileTemplate.Android", "Android.Content.Context, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1 });
	}


	public SmoothGridLayoutManager (android.content.Context p0, int p1, int p2, boolean p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == SmoothGridLayoutManager.class)
			mono.android.TypeManager.Activate ("MobileTemplate.Android.FastGrid.SmoothGridLayoutManager, MobileTemplate.Android", "Android.Content.Context, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib:System.Boolean, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public void smoothScrollToPosition (android.support.v7.widget.RecyclerView p0, android.support.v7.widget.RecyclerView.State p1, int p2)
	{
		n_smoothScrollToPosition (p0, p1, p2);
	}

	private native void n_smoothScrollToPosition (android.support.v7.widget.RecyclerView p0, android.support.v7.widget.RecyclerView.State p1, int p2);


	public int computeVerticalScrollOffset (android.support.v7.widget.RecyclerView.State p0)
	{
		return n_computeVerticalScrollOffset (p0);
	}

	private native int n_computeVerticalScrollOffset (android.support.v7.widget.RecyclerView.State p0);

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
