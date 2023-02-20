package dadm.kzapzam.quotationshake.ui.newquotation
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import dadm.kzapzam.quotationshake.R
import dadm.kzapzam.quotationshake.databinding.FragmentNewQuotationBinding

class QuotationFragment : Fragment(R.layout.fragment_new_quotation) {
    private var _binding : FragmentNewQuotationBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentNewQuotationBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}