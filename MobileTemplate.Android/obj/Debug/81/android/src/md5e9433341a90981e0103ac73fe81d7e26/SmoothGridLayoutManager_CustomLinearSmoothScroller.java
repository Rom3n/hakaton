package md5e9433341a90981e0103ac73fe81d7e26;


public class SmoothGridLayoutManager_CustomLinearSmoothScroller
	extends android.support.v7.widget.LinearSmoothScroller
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_computeScrollVectorForPosition:(I)Landroid/graphics/PointF;:GetComputeScrollVectorForPosition_IHandler\n" +
			"n_calculateSpeedPerPixel:(Landroid/util/DisplayMetrics;)F:GetCalculateSpeedPerPixel_Landroid_util_DisplayMetrics_Handler\n" +
			"";
		mono.android.Runtime.register ("MobileTemplate.Android.FastGrid.SmoothGridLayoutManager+CustomLinearSmoothScroller, MobileTemplate.Android", SmoothGridLayoutManager_CustomLinearSmoothScroller.class, __md_methods);
	}


	public SmoothGridLayoutManager_CustomLinearSmoothScroller (android.content.Context p0)
	{
		super (p0);
		if (getClass () == SmoothGridLayoutManager_CustomLinearSmoothScroller.class)
			mono.android.TypeManager.Activate ("MobileTemplate.Android.FastGrid.SmoothGridLayoutManager+CustomLinearSmoothScroller, MobileTemplate.Android", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public android.graphics.PointF computeScrollVectorForPosition (int p0)
	{
		return n_computeScrollVectorForPosition (p0);
	}

	private native android.graphics.PointF n_computeScrollVectorForPosition (int p0);


	public float calculateSpeedPerPixel (android.util.DisplayMetrics p0)
	{
		return n_calculateSpeedPerPixel (p0);
	}

	private native float n_calculateSpeedPerPixel (android.util.DisplayMetrics p0);

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
