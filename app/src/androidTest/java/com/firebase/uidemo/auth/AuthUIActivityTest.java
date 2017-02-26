package com.firebase.uidemo.auth;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.firebase.uidemo.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
public class AuthUIActivityTest {
    @Rule
    public ActivityTestRule<AuthUiActivity> mAuthActivityRule = new ActivityTestRule<AuthUiActivity>(AuthUiActivity.class);

    @Test
    public void testDefaultAuthView() {
        onView(allOf(withId(R.id.sign_in),isDisplayed()));
        onView(allOf(withId(R.id.default_theme),isDisplayed()));
        onView(allOf(withId(R.id.purple_theme),isDisplayed()));
        onView(allOf(withId(R.id.green_theme),isDisplayed()));
        onView(allOf(withId(R.id.dark_theme),isDisplayed()));
        onView(allOf(withId(R.id.google_provider),isDisplayed()));
        onView(allOf(withId(R.id.facebook_provider),isDisplayed()));
        onView(allOf(withId(R.id.twitter_provider),isDisplayed()));
        onView(allOf(withId(R.id.email_provider),isDisplayed()));
        onView(allOf(withId(R.id.google_tos),isDisplayed()));
        onView(allOf(withId(R.id.firebase_tos),isDisplayed()));
        onView(allOf(withId(R.id.firebase_logo),isDisplayed()));
        onView(allOf(withId(R.id.google_logo),isDisplayed()));
        onView(allOf(withId(R.id.no_logo),isDisplayed()));
        onView(allOf(withId(R.id.facebook_scopes_label),isDisplayed()));
        onView(allOf(withId(R.id.facebook_scope_friends),isDisplayed()));
        onView(allOf(withId(R.id.facebook_scope_photos),isDisplayed()));
        onView(allOf(withId(R.id.google_scopes_label),isDisplayed()));
        onView(allOf(withId(R.id.google_scope_games),isDisplayed()));
        onView(allOf(withId(R.id.google_scope_drive_file),isDisplayed()));
        onView(allOf(withId(R.id.smartlock_enabled),isDisplayed()));
        onView(allOf(withId(R.id.allow_new_email_accounts),isDisplayed()));




    }
}
