package md5e9433341a90981e0103ac73fe81d7e26;


public class FastGridViewRenderer
	extends md51558244f76c53b6aeda52c8a337f2c37.ViewRenderer_2
	implements
		mono.android.IGCUserPeer,
		android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onConfigurationChanged:(Landroid/content/res/Configuration;)V:GetOnConfigurationChanged_Landroid_content_res_Configuration_Handler\n" +
			"n_onSizeChanged:(IIII)V:GetOnSizeChanged_IIIIHandler\n" +
			"n_onRefresh:()V:GetOnRefreshHandler:Android.Support.V4.Widget.SwipeRefreshLayout/IOnRefreshListenerInvoker, Xamarin.Android.Support.Core.UI\n" +
			"";
		mono.android.Runtime.register ("MobileTemplate.Android.FastGrid.FastGridViewRenderer, MobileTemplate.Android", FastGridViewRenderer.class, __md_methods);
	}


	public FastGridViewRenderer (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == FastGridViewRenderer.class)
			mono.android.TypeManager.Activate ("MobileTemplate.Android.FastGrid.FastGridViewRenderer, MobileTemplate.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public FastGridViewRenderer (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == FastGridViewRenderer.class)
			mono.android.TypeManager.Activate ("MobileTemplate.Android.FastGrid.FastGridViewRenderer, MobileTemplate.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public FastGridViewRenderer (android.content.Context p0)
	{
		super (p0);
		if (getClass () == FastGridViewRenderer.class)
			mono.android.TypeManager.Activate ("MobileTemplate.Android.FastGrid.FastGridViewRenderer, MobileTemplate.Android", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public void onConfigurationChanged (android.content.res.Configuration p0)
	{
		n_onConfigurationChanged (p0);
	}

	private native void n_onConfigurationChanged (android.content.res.Configuration p0);


	public void onSizeChanged (int p0, int p1, int p2, int p3)
	{
		n_onSizeChanged (p0, p1, p2, p3);
	}

	private native void n_onSizeChanged (int p0, int p1, int p2, int p3);


	public void onRefresh ()
	{
		n_onRefresh ();
	}

	private native void n_onRefresh ();

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
