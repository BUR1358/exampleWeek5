import androidx.recyclerview.widget.RecyclerView
import com.bur.exampleweek5.Util.CardClickListener
import com.bur.exampleweek5.databinding.CardCellBinding
import com.bur.exampleweek5.model.CardView

class CardViewHolder(
    private val cardCellBinding: CardCellBinding,
    private val cardClickListener: CardClickListener

) : RecyclerView.ViewHolder(cardCellBinding.root) {
    fun bindCard(cardView: CardView) {
        cardCellBinding.cardName.text = cardView.name
        cardCellBinding.cardView.setOnClickListener {
            cardClickListener.OnClick(cardView)
        }
    }
}