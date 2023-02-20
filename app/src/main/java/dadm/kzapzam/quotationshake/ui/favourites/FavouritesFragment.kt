package dadm.kzapzam.quotationshake.ui.favourites
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import dadm.kzapzam.quotationshake.R
import dadm.kzapzam.quotationshake.databinding.FragmentFaveBinding

class FavouritesFragment : Fragment(R.layout.fragment_new_quotation) {
    private var _binding : FragmentFaveBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentFaveBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
