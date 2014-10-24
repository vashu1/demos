// backbone example
var CampaignDetailsModel = Backbone.Model.extend({
    urlRoot: 'rest/campaign/list',

    initialize: function () {
        console.log('Campaing Details Model has been created');
    }
});

var campaignDetailModel = new CampaignDetailsModel();

// backbone example view
var HeaderUserView = Backbone.View.extend({
    className: 'header-user',

    template: _.template($('#template-header-user').html()),

    initialize: function () {
        console.log('Header User View has been initialized');
        this.render();
    },

    render: function () {
        this.$el.html(this.template());
        $('.header-wrapper').append(this.$el);
        return this;
    },

    events: {
        'click .header-user-alerts' : function () {
            $('.header-alerts').fadeToggle('fast');
        }
    }
});

var CampaingDetailView = Backbone.View.extend({
    model: campaignDetailModel,

    className: 'clearfix',

    id: 'wrap',

    template: _.template($('#template-campaign-detail').html()),

    initialize: function () {
        console.log('Campaign Detail View has been initialized');

        this.render();
    },

    render: function () {
        var that = this;

        this.model.fetch({
            success: function () {
                that.$el.html( that.template( that.model.toJSON() ) );
                $('#main').append(that.$el);

                // hardcode
                $('.pds-partners thead').on('click', function () {
                    $(this).siblings('tbody').fadeToggle('fast');
                    $('.toggle ',this).toggleClass('active');
                });
                $(".selectbox").selectbox();

                $( ".x-checkbox input" ).button();

                $( ".risk-radios" ).buttonset();

                $("#pdssowtabs").tabs();

                $('.dbd-output-title, .pds-output-title').on('click', function () {
                    $(this).siblings('.output-wrapper').fadeToggle('slow');
                    $(this).toggleClass('unactive');
                });

                return that;
            },
            error: function () {
                console.log('fetch error');
            }
        });
    }
});

var headerUserView = new HeaderUserView();
var campaingDetailView = new CampaingDetailView();