package net.mathdoku.holoken;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Bundle;
import android.preference.PreferenceActivity;

public class SettingsActivity extends PreferenceActivity implements OnSharedPreferenceChangeListener {
    
  @Override
  public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      // Deprecated addPreferencesFromResources, use fragments instead?
      addPreferencesFromResource(R.layout.settings_view); 
  }
  
  public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {

  }
}