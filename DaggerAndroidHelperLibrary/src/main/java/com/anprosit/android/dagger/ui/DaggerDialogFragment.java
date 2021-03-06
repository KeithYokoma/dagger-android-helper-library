package com.anprosit.android.dagger.ui;

import android.annotation.TargetApi;
import android.app.DialogFragment;
import android.os.Build;
import android.os.Bundle;

import com.anprosit.android.dagger.DaggerContext;

/**
 * @author hnakagawa
 */
@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class DaggerDialogFragment extends DialogFragment {
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		((DaggerContext) getActivity()).inject(this);
	}
}
