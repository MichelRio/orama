package com.example.orama.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Item {


    @SerializedName("fund_manager")
    private Fund_manager fund_manager;
    @SerializedName("is_closed_to_capture")
    private boolean is_closed_to_capture;
    @SerializedName("net_patrimony_12m")
    private String net_patrimony_12m;
    @SerializedName("closed_to_capture_explanation")
    private String closed_to_capture_explanation;
    @SerializedName("profitabilities")
    private Profitabilities profitabilities;
    @SerializedName("strategy_video")
    private Strategy_video strategy_video;
    @SerializedName("volatility_12m")
    private String volatility_12m;
    @SerializedName("slug")
    private String slug;
    @SerializedName("orama_standard")
    private boolean orama_standard;
    @SerializedName("benchmark")
    private Benchmark benchmark;
    @SerializedName("quota_date")
    private String quota_date;
    @SerializedName("description")
    private Description description;
    @SerializedName("cnpj")
    private String cnpj;
    @SerializedName("tax_classification")
    private String tax_classification;
    @SerializedName("is_active")
    private boolean is_active;
    @SerializedName("specification")
    private Specification specification;
    @SerializedName("documents")
    private List<Documents> documents;
    @SerializedName("simple_name")
    private String simple_name;
    @SerializedName("is_closed")
    private boolean is_closed;
    @SerializedName("id")
    private int id;
    @SerializedName("fees")
    private Fees fees;
    @SerializedName("full_name")
    private String full_name;
    @SerializedName("operability")
    private Operability operability;
    @SerializedName("description_seo")
    private String description_seo;
    @SerializedName("initial_date")
    private String initial_date;

    public Fund_manager getFund_manager() {
        return fund_manager;
    }

    public void setFund_manager(Fund_manager fund_manager) {
        this.fund_manager = fund_manager;
    }

    public boolean getIs_closed_to_capture() {
        return is_closed_to_capture;
    }

    public void setIs_closed_to_capture(boolean is_closed_to_capture) {
        this.is_closed_to_capture = is_closed_to_capture;
    }

    public String getNet_patrimony_12m() {
        return net_patrimony_12m;
    }

    public void setNet_patrimony_12m(String net_patrimony_12m) {
        this.net_patrimony_12m = net_patrimony_12m;
    }

    public String getClosed_to_capture_explanation() {
        return closed_to_capture_explanation;
    }

    public void setClosed_to_capture_explanation(String closed_to_capture_explanation) {
        this.closed_to_capture_explanation = closed_to_capture_explanation;
    }

    public Profitabilities getProfitabilities() {
        return profitabilities;
    }

    public void setProfitabilities(Profitabilities profitabilities) {
        this.profitabilities = profitabilities;
    }

    public Strategy_video getStrategy_video() {
        return strategy_video;
    }

    public void setStrategy_video(Strategy_video strategy_video) {
        this.strategy_video = strategy_video;
    }

    public String getVolatility_12m() {
        return volatility_12m;
    }

    public void setVolatility_12m(String volatility_12m) {
        this.volatility_12m = volatility_12m;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public boolean getOrama_standard() {
        return orama_standard;
    }

    public void setOrama_standard(boolean orama_standard) {
        this.orama_standard = orama_standard;
    }

    public Benchmark getBenchmark() {
        return benchmark;
    }

    public void setBenchmark(Benchmark benchmark) {
        this.benchmark = benchmark;
    }

    public String getQuota_date() {
        return quota_date;
    }

    public void setQuota_date(String quota_date) {
        this.quota_date = quota_date;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTax_classification() {
        return tax_classification;
    }

    public void setTax_classification(String tax_classification) {
        this.tax_classification = tax_classification;
    }

    public boolean getIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

    public Specification getSpecification() {
        return specification;
    }

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public List<Documents> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Documents> documents) {
        this.documents = documents;
    }

    public String getSimple_name() {
        return simple_name;
    }

    public void setSimple_name(String simple_name) {
        this.simple_name = simple_name;
    }

    public boolean getIs_closed() {
        return is_closed;
    }

    public void setIs_closed(boolean is_closed) {
        this.is_closed = is_closed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Fees getFees() {
        return fees;
    }

    public void setFees(Fees fees) {
        this.fees = fees;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public Operability getOperability() {
        return operability;
    }

    public void setOperability(Operability operability) {
        this.operability = operability;
    }

    public String getDescription_seo() {
        return description_seo;
    }

    public void setDescription_seo(String description_seo) {
        this.description_seo = description_seo;
    }


    public String getInitial_date() {
        return initial_date;
    }

    public void setInitial_date(String initial_date) {
        this.initial_date = initial_date;
    }

    public static class Fund_manager {
        @SerializedName("name")
        private String name;
        @SerializedName("slug")
        private String slug;
        @SerializedName("logo")
        private String logo;
        @SerializedName("full_name")
        private String full_name;
        @SerializedName("id")
        private int id;
        @SerializedName("description")
        private String description;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public String getLogo() {
            return logo;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }

        public String getFull_name() {
            return full_name;
        }

        public void setFull_name(String full_name) {
            this.full_name = full_name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

    public static class Profitabilities {
        @SerializedName("day")
        private String day;
        @SerializedName("year")
        private String year;
        @SerializedName("m12")
        private String m12;
        @SerializedName("month")
        private String month;
        @SerializedName("m36")
        private String m36;
        @SerializedName("m24")
        private String m24;
        @SerializedName("m48")
        private String m48;
        @SerializedName("m60")
        private String m60;

        public String getDay() {
            return day;
        }

        public void setDay(String day) {
            this.day = day;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public String getM12() {
            return m12;
        }

        public void setM12(String m12) {
            this.m12 = m12;
        }

        public String getMonth() {
            return month;
        }

        public void setMonth(String month) {
            this.month = month;
        }

        public String getM36() {
            return m36;
        }

        public void setM36(String m36) {
            this.m36 = m36;
        }

        public String getM24() {
            return m24;
        }

        public void setM24(String m24) {
            this.m24 = m24;
        }

        public String getM48() {
            return m48;
        }

        public void setM48(String m48) {
            this.m48 = m48;
        }

        public String getM60() {
            return m60;
        }

        public void setM60(String m60) {
            this.m60 = m60;
        }
    }

    public static class Strategy_video {
        @SerializedName("thumbnail")
        private String thumbnail;
        @SerializedName("youtube_id")
        private String youtube_id;
        @SerializedName("enabled_for_tvorama")
        private boolean enabled_for_tvorama;
        @SerializedName("id")
        private int id;
        @SerializedName("published")
        private String published;
        @SerializedName("url")
        private String url;
        @SerializedName("title")
        private String title;
        @SerializedName("description")
        private String description;

        public String getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        public String getYoutube_id() {
            return youtube_id;
        }

        public void setYoutube_id(String youtube_id) {
            this.youtube_id = youtube_id;
        }

        public boolean getEnabled_for_tvorama() {
            return enabled_for_tvorama;
        }

        public void setEnabled_for_tvorama(boolean enabled_for_tvorama) {
            this.enabled_for_tvorama = enabled_for_tvorama;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getPublished() {
            return published;
        }

        public void setPublished(String published) {
            this.published = published;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

    public static class Benchmark {
        @SerializedName("name")
        private String name;
        @SerializedName("id")
        private int id;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }

    public static class Description {
        @SerializedName("strategy")
        private String strategy;
        @SerializedName("strengths")
        private String strengths;
        @SerializedName("target_audience")
        private String target_audience;
        @SerializedName("objective")
        private String objective;

        public String getStrategy() {
            return strategy;
        }

        public void setStrategy(String strategy) {
            this.strategy = strategy;
        }

        public String getStrengths() {
            return strengths;
        }

        public void setStrengths(String strengths) {
            this.strengths = strengths;
        }

        public String getTarget_audience() {
            return target_audience;
        }

        public void setTarget_audience(String target_audience) {
            this.target_audience = target_audience;
        }

        public String getObjective() {
            return objective;
        }

        public void setObjective(String objective) {
            this.objective = objective;
        }
    }

    public static class Specification {
        @SerializedName("fund_main_strategy")
        private Fund_main_strategy fund_main_strategy;
        @SerializedName("fund_macro_strategy")
        private Fund_macro_strategy fund_macro_strategy;
        @SerializedName("fund_class")
        private String fund_class;
        @SerializedName("fund_type")
        private String fund_type;
        @SerializedName("is_qualified")
        private boolean is_qualified;
        @SerializedName("fund_risk_profile")
        private Fund_risk_profile fund_risk_profile;
        @SerializedName("fund_suitability_profile")
        private Fund_suitability_profile fund_suitability_profile;

        public Fund_main_strategy getFund_main_strategy() {
            return fund_main_strategy;
        }

        public void setFund_main_strategy(Fund_main_strategy fund_main_strategy) {
            this.fund_main_strategy = fund_main_strategy;
        }

        public Fund_macro_strategy getFund_macro_strategy() {
            return fund_macro_strategy;
        }

        public void setFund_macro_strategy(Fund_macro_strategy fund_macro_strategy) {
            this.fund_macro_strategy = fund_macro_strategy;
        }

        public String getFund_class() {
            return fund_class;
        }

        public void setFund_class(String fund_class) {
            this.fund_class = fund_class;
        }

        public String getFund_type() {
            return fund_type;
        }

        public void setFund_type(String fund_type) {
            this.fund_type = fund_type;
        }

        public boolean getIs_qualified() {
            return is_qualified;
        }

        public void setIs_qualified(boolean is_qualified) {
            this.is_qualified = is_qualified;
        }

        public Fund_risk_profile getFund_risk_profile() {
            return fund_risk_profile;
        }

        public void setFund_risk_profile(Fund_risk_profile fund_risk_profile) {
            this.fund_risk_profile = fund_risk_profile;
        }

        public Fund_suitability_profile getFund_suitability_profile() {
            return fund_suitability_profile;
        }

        public void setFund_suitability_profile(Fund_suitability_profile fund_suitability_profile) {
            this.fund_suitability_profile = fund_suitability_profile;
        }
    }

    public static class Fund_main_strategy {
        @SerializedName("name")
        private String name;
        @SerializedName("id")
        private int id;
        @SerializedName("fund_macro_strategy")
        private int fund_macro_strategy;
        @SerializedName("explanation")
        private String explanation;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getFund_macro_strategy() {
            return fund_macro_strategy;
        }

        public void setFund_macro_strategy(int fund_macro_strategy) {
            this.fund_macro_strategy = fund_macro_strategy;
        }

        public String getExplanation() {
            return explanation;
        }

        public void setExplanation(String explanation) {
            this.explanation = explanation;
        }
    }

    public static class Fund_macro_strategy {
        @SerializedName("name")
        private String name;
        @SerializedName("id")
        private int id;
        @SerializedName("explanation")
        private String explanation;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getExplanation() {
            return explanation;
        }

        public void setExplanation(String explanation) {
            this.explanation = explanation;
        }
    }

    public static class Fund_risk_profile {
        @SerializedName("name")
        private String name;
        @SerializedName("score_range_order")
        private int score_range_order;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getScore_range_order() {
            return score_range_order;
        }

        public void setScore_range_order(int score_range_order) {
            this.score_range_order = score_range_order;
        }
    }

    public static class Fund_suitability_profile {
        @SerializedName("name")
        private String name;
        @SerializedName("score_range_order")
        private int score_range_order;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getScore_range_order() {
            return score_range_order;
        }

        public void setScore_range_order(int score_range_order) {
            this.score_range_order = score_range_order;
        }
    }

    public static class Documents {
        @SerializedName("document_url")
        private String document_url;
        @SerializedName("name")
        private String name;
        @SerializedName("document_type")
        private String document_type;
        @SerializedName("position")
        private int position;

        public String getDocument_url() {
            return document_url;
        }

        public void setDocument_url(String document_url) {
            this.document_url = document_url;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDocument_type() {
            return document_type;
        }

        public void setDocument_type(String document_type) {
            this.document_type = document_type;
        }

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }
    }

    public static class Fees {
        @SerializedName("has_anticipated_retrieval")
        private boolean has_anticipated_retrieval;
        @SerializedName("performance_fee")
        private String performance_fee;
        @SerializedName("anticipated_retrieval_fee")
        private String anticipated_retrieval_fee;
        @SerializedName("administration_fee")
        private String administration_fee;
        @SerializedName("anticipated_retrieval_fee_value")
        private String anticipated_retrieval_fee_value;
        @SerializedName("maximum_administration_fee")
        private String maximum_administration_fee;

        public boolean getHas_anticipated_retrieval() {
            return has_anticipated_retrieval;
        }

        public void setHas_anticipated_retrieval(boolean has_anticipated_retrieval) {
            this.has_anticipated_retrieval = has_anticipated_retrieval;
        }

        public String getPerformance_fee() {
            return performance_fee;
        }

        public void setPerformance_fee(String performance_fee) {
            this.performance_fee = performance_fee;
        }

        public String getAnticipated_retrieval_fee() {
            return anticipated_retrieval_fee;
        }

        public void setAnticipated_retrieval_fee(String anticipated_retrieval_fee) {
            this.anticipated_retrieval_fee = anticipated_retrieval_fee;
        }

        public String getAdministration_fee() {
            return administration_fee;
        }

        public void setAdministration_fee(String administration_fee) {
            this.administration_fee = administration_fee;
        }

        public String getAnticipated_retrieval_fee_value() {
            return anticipated_retrieval_fee_value;
        }

        public void setAnticipated_retrieval_fee_value(String anticipated_retrieval_fee_value) {
            this.anticipated_retrieval_fee_value = anticipated_retrieval_fee_value;
        }

        public String getMaximum_administration_fee() {
            return maximum_administration_fee;
        }

        public void setMaximum_administration_fee(String maximum_administration_fee) {
            this.maximum_administration_fee = maximum_administration_fee;
        }
    }

    public static class Operability {
        @SerializedName("minimum_subsequent_application_amount")
        private String minimum_subsequent_application_amount;
        @SerializedName("maximum_initial_application_amount")
        private String maximum_initial_application_amount;
        @SerializedName("anticipated_retrieval_quotation_days_type")
        private String anticipated_retrieval_quotation_days_type;
        @SerializedName("application_quotation_days")
        private int application_quotation_days;
        @SerializedName("retrieval_liquidation_days")
        private int retrieval_liquidation_days;
        @SerializedName("minimum_subsequent_retrieval_amount")
        private String minimum_subsequent_retrieval_amount;
        @SerializedName("retrieval_liquidation_days_str")
        private String retrieval_liquidation_days_str;
        @SerializedName("retrieval_quotation_days_str")
        private String retrieval_quotation_days_str;
        @SerializedName("application_quotation_days_str")
        private String application_quotation_days_str;
        @SerializedName("retrieval_special_type")
        private String retrieval_special_type;
        @SerializedName("has_operations_on_fridays")
        private boolean has_operations_on_fridays;
        @SerializedName("retrieval_time_limit")
        private String retrieval_time_limit;
        @SerializedName("has_operations_on_mondays")
        private boolean has_operations_on_mondays;
        @SerializedName("application_time_limit")
        private String application_time_limit;
        @SerializedName("minimum_initial_application_amount")
        private String minimum_initial_application_amount;
        @SerializedName("has_operations_on_tuesdays")
        private boolean has_operations_on_tuesdays;
        @SerializedName("minimum_balance_permanence")
        private String minimum_balance_permanence;
        @SerializedName("has_operations_on_wednesdays")
        private boolean has_operations_on_wednesdays;
        @SerializedName("anticipated_retrieval_quotation_days")
        private int anticipated_retrieval_quotation_days;
        @SerializedName("retrieval_quotation_days_type")
        private String retrieval_quotation_days_type;
        @SerializedName("anticipated_retrieval_quotation_days_str")
        private String anticipated_retrieval_quotation_days_str;
        @SerializedName("retrieval_quotation_days")
        private int retrieval_quotation_days;
        @SerializedName("application_quotation_days_type")
        private String application_quotation_days_type;
        @SerializedName("retrieval_liquidation_days_type")
        private String retrieval_liquidation_days_type;
        @SerializedName("has_operations_on_thursdays")
        private boolean has_operations_on_thursdays;

        public String getMinimum_subsequent_application_amount() {
            return minimum_subsequent_application_amount;
        }

        public void setMinimum_subsequent_application_amount(String minimum_subsequent_application_amount) {
            this.minimum_subsequent_application_amount = minimum_subsequent_application_amount;
        }

        public String getMaximum_initial_application_amount() {
            return maximum_initial_application_amount;
        }

        public void setMaximum_initial_application_amount(String maximum_initial_application_amount) {
            this.maximum_initial_application_amount = maximum_initial_application_amount;
        }

        public String getAnticipated_retrieval_quotation_days_type() {
            return anticipated_retrieval_quotation_days_type;
        }

        public void setAnticipated_retrieval_quotation_days_type(String anticipated_retrieval_quotation_days_type) {
            this.anticipated_retrieval_quotation_days_type = anticipated_retrieval_quotation_days_type;
        }

        public int getApplication_quotation_days() {
            return application_quotation_days;
        }

        public void setApplication_quotation_days(int application_quotation_days) {
            this.application_quotation_days = application_quotation_days;
        }

        public int getRetrieval_liquidation_days() {
            return retrieval_liquidation_days;
        }

        public void setRetrieval_liquidation_days(int retrieval_liquidation_days) {
            this.retrieval_liquidation_days = retrieval_liquidation_days;
        }

        public String getMinimum_subsequent_retrieval_amount() {
            return minimum_subsequent_retrieval_amount;
        }

        public void setMinimum_subsequent_retrieval_amount(String minimum_subsequent_retrieval_amount) {
            this.minimum_subsequent_retrieval_amount = minimum_subsequent_retrieval_amount;
        }

        public String getRetrieval_liquidation_days_str() {
            return retrieval_liquidation_days_str;
        }

        public void setRetrieval_liquidation_days_str(String retrieval_liquidation_days_str) {
            this.retrieval_liquidation_days_str = retrieval_liquidation_days_str;
        }

        public String getRetrieval_quotation_days_str() {
            return retrieval_quotation_days_str;
        }

        public void setRetrieval_quotation_days_str(String retrieval_quotation_days_str) {
            this.retrieval_quotation_days_str = retrieval_quotation_days_str;
        }

        public String getApplication_quotation_days_str() {
            return application_quotation_days_str;
        }

        public void setApplication_quotation_days_str(String application_quotation_days_str) {
            this.application_quotation_days_str = application_quotation_days_str;
        }

        public String getRetrieval_special_type() {
            return retrieval_special_type;
        }

        public void setRetrieval_special_type(String retrieval_special_type) {
            this.retrieval_special_type = retrieval_special_type;
        }

        public boolean getHas_operations_on_fridays() {
            return has_operations_on_fridays;
        }

        public void setHas_operations_on_fridays(boolean has_operations_on_fridays) {
            this.has_operations_on_fridays = has_operations_on_fridays;
        }

        public String getRetrieval_time_limit() {
            return retrieval_time_limit;
        }

        public void setRetrieval_time_limit(String retrieval_time_limit) {
            this.retrieval_time_limit = retrieval_time_limit;
        }

        public boolean getHas_operations_on_mondays() {
            return has_operations_on_mondays;
        }

        public void setHas_operations_on_mondays(boolean has_operations_on_mondays) {
            this.has_operations_on_mondays = has_operations_on_mondays;
        }

        public String getApplication_time_limit() {
            return application_time_limit;
        }

        public void setApplication_time_limit(String application_time_limit) {
            this.application_time_limit = application_time_limit;
        }

        public String getMinimum_initial_application_amount() {
            return minimum_initial_application_amount;
        }

        public void setMinimum_initial_application_amount(String minimum_initial_application_amount) {
            this.minimum_initial_application_amount = minimum_initial_application_amount;
        }

        public boolean getHas_operations_on_tuesdays() {
            return has_operations_on_tuesdays;
        }

        public void setHas_operations_on_tuesdays(boolean has_operations_on_tuesdays) {
            this.has_operations_on_tuesdays = has_operations_on_tuesdays;
        }

        public String getMinimum_balance_permanence() {
            return minimum_balance_permanence;
        }

        public void setMinimum_balance_permanence(String minimum_balance_permanence) {
            this.minimum_balance_permanence = minimum_balance_permanence;
        }

        public boolean getHas_operations_on_wednesdays() {
            return has_operations_on_wednesdays;
        }

        public void setHas_operations_on_wednesdays(boolean has_operations_on_wednesdays) {
            this.has_operations_on_wednesdays = has_operations_on_wednesdays;
        }

        public int getAnticipated_retrieval_quotation_days() {
            return anticipated_retrieval_quotation_days;
        }

        public void setAnticipated_retrieval_quotation_days(int anticipated_retrieval_quotation_days) {
            this.anticipated_retrieval_quotation_days = anticipated_retrieval_quotation_days;
        }

        public String getRetrieval_quotation_days_type() {
            return retrieval_quotation_days_type;
        }

        public void setRetrieval_quotation_days_type(String retrieval_quotation_days_type) {
            this.retrieval_quotation_days_type = retrieval_quotation_days_type;
        }

        public String getAnticipated_retrieval_quotation_days_str() {
            return anticipated_retrieval_quotation_days_str;
        }

        public void setAnticipated_retrieval_quotation_days_str(String anticipated_retrieval_quotation_days_str) {
            this.anticipated_retrieval_quotation_days_str = anticipated_retrieval_quotation_days_str;
        }

        public int getRetrieval_quotation_days() {
            return retrieval_quotation_days;
        }

        public void setRetrieval_quotation_days(int retrieval_quotation_days) {
            this.retrieval_quotation_days = retrieval_quotation_days;
        }

        public String getApplication_quotation_days_type() {
            return application_quotation_days_type;
        }

        public void setApplication_quotation_days_type(String application_quotation_days_type) {
            this.application_quotation_days_type = application_quotation_days_type;
        }

        public String getRetrieval_liquidation_days_type() {
            return retrieval_liquidation_days_type;
        }

        public void setRetrieval_liquidation_days_type(String retrieval_liquidation_days_type) {
            this.retrieval_liquidation_days_type = retrieval_liquidation_days_type;
        }

        public boolean getHas_operations_on_thursdays() {
            return has_operations_on_thursdays;
        }

        public void setHas_operations_on_thursdays(boolean has_operations_on_thursdays) {
            this.has_operations_on_thursdays = has_operations_on_thursdays;
        }
    }
}


