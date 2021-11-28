package com.nicholaskarlson.simplebible.ui.ops;

import androidx.annotation.Nullable;

import com.nicholaskarlson.simplebible.model.Book;

public interface BookListScreenOps {

  void handleBookSelection(@Nullable Book book);

}
