package  com.example.milktea.adapter.admin;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.milktea.fragment.admin.AdminCategoryFragment;
import com.example.milktea.fragment.admin.AdminDrinkFragment;
import com.example.milktea.fragment.admin.AdminOrderFragment;
import com.example.milktea.fragment.admin.AdminSettingsFragment;

public class AdminViewPagerAdapter extends FragmentStateAdapter {

    public AdminViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 1:
                return new AdminDrinkFragment();

            case 2:
                return new AdminOrderFragment();

            case 3:
                return new AdminSettingsFragment();

            default:
                return new AdminCategoryFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
