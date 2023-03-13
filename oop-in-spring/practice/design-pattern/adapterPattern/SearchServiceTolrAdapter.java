import adapterPattern.SearchService;

public class SearchServiceTolrAdapter implements SearchService {
    private TolrClient tolrClient = new TolrClient();

    @Override
    public SearchResult search(String keyword) {
        // keyword를 tolrClient가 요구하는 형식으로 변환
        TolrQuery tolrQuery = new TolrQuery(keyword);

        // TolrClient 기능 실행
        QueryResponse response = tolrClient.query(tolrQuery);

        SearchResult result = convertToResult(response);
        return result;
    }

    private SearchResult convertToResult(QueryResponse response) {
        List<TolrDocument> tolrDocs = response.getDocumentList().getDocuments();
        List<SearchDocument> docs = new ArrayList<SearchDocument>();
        for(TolrDocument tolrDoc: tolrDocs) {
            docs.add(new SearchDocument(tolrDocs.getId(), ...));
        }
        return new SearchResult(docs);
    }
}