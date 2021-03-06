package com.nicholaskarlson.simplebible.ui.ops;

import androidx.annotation.IntRange;
import androidx.annotation.Nullable;

import com.nicholaskarlson.simplebible.model.Verse;

public interface BookmarkScreenOps {

  @Nullable
  Verse getVerseAtPosition(@IntRange(from = 0) int position);

  @IntRange(from = 0)
  int getCachedVerseListSize();

}
