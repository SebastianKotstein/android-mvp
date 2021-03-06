/*
 * This source code is part of the research paper
 * "Applying Model-View-Presenter Architecture to the Android Framework with App Prototype"
 *
 * Software Architecture and Management,
 * Herman-Hollerith-Zentrum, Reutlingen University
 *
 * Authors:  Dennis G. Geisse,
 *           Iven John,
 *           Daniel Joos,
 *           Sebastian Kotstein,
 *           Michael Wurster
 *
 * Year:     2015
 */

package inf.msc.yawapp.search;

import java.util.List;

import javax.inject.Inject;

import inf.msc.yawapp.model.SearchSuggestions;
import inf.msc.yawapp.navigation.SubmitSearchInteractor;

public class SearchPresenterImpl implements SearchPresenter {
    @Inject
    SearchView view;

    @Inject
    SubmitSearchInteractor submitSearchInteractor;

    @Inject
    SearchSuggestions searchSuggestions;

    @Override
    public void updateSearch(String query) {
        if (query.isEmpty()) {
            view.clearSuggestions();
        } else {
            List<String> suggestions = searchSuggestions.getSuggestions(query, 25);
            view.showSuggestions(suggestions);
        }
    }

    @Override
    public void submitSearch(String query) {
        submitSearchInteractor.submitSearch(query);
        view.close();
    }

    @Override
    public void close() {
        view.close();
    }
}
