using System;
using System.Collections.Generic;
using System.Text;
using Xamarin.Forms;

namespace MobileTemplate.UI.Behaviours {
	public class BindableBehavior<T> : Behavior<T> where T : BindableObject {
		public T LinkedElement { get; private set; }

		protected override void OnAttachedTo(T visualElement) {
			base.OnAttachedTo(visualElement);

			LinkedElement = visualElement;

			if (visualElement.BindingContext != null)
				BindingContext = visualElement.BindingContext;

			visualElement.BindingContextChanged += OnBindingContextChanged;
		}

		private void OnBindingContextChanged(object sender, EventArgs e) {
			OnBindingContextChanged();
		}

		protected override void OnDetachingFrom(T view) {
			view.BindingContextChanged -= OnBindingContextChanged;
		}

		protected override void OnBindingContextChanged() {
			base.OnBindingContextChanged();
			BindingContext = LinkedElement.BindingContext;
		}
	}
}
