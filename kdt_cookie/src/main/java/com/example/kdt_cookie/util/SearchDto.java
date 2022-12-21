package com.example.kdt_cookie.util;




public class SearchDto {

    private int page;             // 현재 페이지 번호
    private int recordSize;       // 페이지당 출력할 데이터 개수
    private int pageSize;         // 화면 하단에 출력할 페이지 사이즈
    private String keyword;       // 검색 키워드
    private String searchType;    // 검색 유형

    private Pagination pagination;    // 페이지네이션 정보

    public SearchDto() {
        this.page = 1;
        this.recordSize = 10;
        this.pageSize = 10;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setRecordSize(int recordSize) {
        this.recordSize = recordSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public int getPage() {
        return page;
    }

    public int getRecordSize() {
        return recordSize;
    }

    public int getPageSize() {
        return pageSize;
    }

    public String getKeyword() {
        return keyword;
    }

    public String getSearchType() {
        return searchType;
    }

    public Pagination getPagination() {
        return pagination;
    }

    @Override
    public String toString() {
        return "SearchDto{" +
                "page=" + page +
                ", recordSize=" + recordSize +
                ", pageSize=" + pageSize +
                ", keyword='" + keyword + '\'' +
                ", searchType='" + searchType + '\'' +
                ", pagination=" + pagination +
                '}';
    }
}