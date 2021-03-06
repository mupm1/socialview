package io.github.hendraanggrian.socialview;

import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.widget.TextView;

import java.util.List;

/**
 * @author Hendra Anggian (hendraanggrian@gmail.com)
 */
public interface SocialView {

    void setHashtagColor(@ColorInt int color);

    void setHashtagColorRes(@ColorRes int colorRes);

    void setMentionColor(@ColorInt int color);

    void setMentionColorRes(@ColorRes int colorRes);

    void setHashtagEnabled(boolean enabled);

    void setMentionEnabled(boolean enabled);

    void setOnHashtagClickListener(@Nullable OnSocialClickListener listener);

    void setOnMentionClickListener(@Nullable OnSocialClickListener listener);

    void setHashtagTextChangedListener(@Nullable SocialTextWatcher watcher);

    void setMentionTextChangedListener(@Nullable SocialTextWatcher watcher);

    @ColorInt
    int getHashtagColor();

    @ColorInt
    int getMentionColor();

    boolean isHashtagEnabled();

    boolean isMentionEnabled();

    @NonNull
    List<String> getHashtags();

    @NonNull
    List<String> getMentions();

    interface OnSocialClickListener {
        void onClick(@NonNull TextView view, @NonNull String s);
    }

    interface SocialTextWatcher {
        void onTextChanged(@NonNull TextView view, @NonNull String s);
    }
}