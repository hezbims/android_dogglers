// Generated by view binder compiler. Do not edit!
package com.example.dogglers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.dogglers.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class GridListItemBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final TextView gridAge;

  @NonNull
  public final TextView gridHobbies;

  @NonNull
  public final ImageView gridImageView;

  @NonNull
  public final TextView gridName;

  private GridListItemBinding(@NonNull MaterialCardView rootView, @NonNull TextView gridAge,
      @NonNull TextView gridHobbies, @NonNull ImageView gridImageView, @NonNull TextView gridName) {
    this.rootView = rootView;
    this.gridAge = gridAge;
    this.gridHobbies = gridHobbies;
    this.gridImageView = gridImageView;
    this.gridName = gridName;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static GridListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static GridListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.grid_list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static GridListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.grid_age;
      TextView gridAge = rootView.findViewById(id);
      if (gridAge == null) {
        break missingId;
      }

      id = R.id.grid_hobbies;
      TextView gridHobbies = rootView.findViewById(id);
      if (gridHobbies == null) {
        break missingId;
      }

      id = R.id.grid_image_view;
      ImageView gridImageView = rootView.findViewById(id);
      if (gridImageView == null) {
        break missingId;
      }

      id = R.id.grid_name;
      TextView gridName = rootView.findViewById(id);
      if (gridName == null) {
        break missingId;
      }

      return new GridListItemBinding((MaterialCardView) rootView, gridAge, gridHobbies,
          gridImageView, gridName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
