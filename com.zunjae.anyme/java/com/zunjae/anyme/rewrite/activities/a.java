package com.zunjae.anyme.rewrite.activities;

import android.view.View;
import defpackage.cr;

final class a extends cr {
    final /* synthetic */ AnimeInfoActivityR2 b;
    final /* synthetic */ AnimeInfoActivityR2_ViewBinding c;

    a(AnimeInfoActivityR2_ViewBinding animeInfoActivityR2_ViewBinding, AnimeInfoActivityR2 animeInfoActivityR2) {
        this.c = animeInfoActivityR2_ViewBinding;
        this.b = animeInfoActivityR2;
    }

    public final void a(View view) {
        this.b.onAnimeCoverImageClicked();
    }
}
