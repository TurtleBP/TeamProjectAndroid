package com.example.milktea.listener;

import com.example.milktea.model.Category;

public interface IOnAdminManagerCategoryListener {
    void onClickUpdateCategory(Category category);
    void onClickDeleteCategory(Category category);
    void onClickItemCategory(Category category);
}
