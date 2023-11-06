package lotto.control;

import lotto.model.Lotto;
import lotto.view.OutputManager;

import java.util.ArrayList;
import java.util.List;

public class LottoController {

    public List<Lotto> createLotto(int purchaseAmount) {
        List<Lotto> lottos = new ArrayList<>();
        for (int i = 0; i < purchaseAmount; i++) {
            lottos.add(new Lotto(Lotto.getRandomNumbers()));
        }
        return lottos;
    }
    public void readLotto(OutputManager outputManager, Lotto lotto) {
        outputManager.printLotto(lotto.getLottoNumbers());
    }
}
