// backbone example
var CampaignDetailsModel = Backbone.Model.extend({
    urlRoot: '/home/campaings/12345/details/rest/campaign/list',

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

                // risk amount sliders
                $("#slider-adult").slider({
                    value: 500,
                    min: 0,
                    max: 1000,
                    slide: function( event, ui ) {
                        $( "#amount-adult" ).text(ui.value);
                    }
                });

                $("#slider-alcohol").slider({
                    value: 500,
                    min: 0,
                    max: 1000,
                    slide: function( event, ui ) {
                        $( "#amount-alcohol" ).text(ui.value);
                    }
                });

                $("#slider-downloads").slider({
                    value: 500,
                    min: 0,
                    max: 1000,
                    slide: function( event, ui ) {
                        $( "#amount-downloads" ).text(ui.value);
                    }
                });

                $("#slider-drugs").slider({
                    value: 500,
                    min: 0,
                    max: 1000,
                    slide: function( event, ui ) {
                        $( "#amount-drugs" ).text(ui.value);
                    }
                });

                $("#slider-hspeech").slider({
                    value: 500,
                    min: 0,
                    max: 1000,
                    slide: function( event, ui ) {
                        $( "#amount-hspeech" ).text(ui.value);
                    }
                });

                $("#slider-offensive").slider({
                    value: 500,
                    min: 0,
                    max: 1000,
                    slide: function( event, ui ) {
                        $( "#amount-offensive" ).text(ui.value);
                    }
                });

                $("#slider-violence").slider({
                    value: 500,
                    min: 0,
                    max: 1000,
                    slide: function( event, ui ) {
                        $( "#amount-violence" ).text(ui.value);
                    }
                });

                $("#slider-atc").slider({
                    value: 500,
                    min: 0,
                    max: 1000,
                    slide: function( event, ui ) {
                        $( "#amount-atc" ).text(ui.value);
                    }
                });

                $("#slider-rsa").slider({
                    value: 500,
                    min: 0,
                    max: 1000,
                    slide: function( event, ui ) {
                        $( "#amount-rsa" ).text(ui.value);
                    }
                });

                $("#pdssowtabs").tabs();

                $(".x-button").button();

                $('.dbd-output-title, .pds-output-title').on('click', function () {
                    $(this).siblings('.output-wrapper').fadeToggle('slow');
                    $(this).toggleClass('unactive');
                });

                $('.pds-sow .toggle').on('click', function () {
                    $(this).closest('tr').toggleClass('active');
                });

                $('.x-flyout').on('click', function () {
                    if ($(this).hasClass('active')) {
                        $('.x-flyout-wrapper', this).hide('fast');
                        $(this).removeClass('active');
                    } else {
                        $('.x-flyout').removeClass('active');
                        $('.x-flyout-wrapper').hide();
                        $(this).addClass('active');
                        $('.x-flyout-wrapper', this).show('fast');
                    }
                });
                // end of hardcode

                return that;
            },
            error: function (e) {
                console.log(e);
            }
        });
    }
});

var headerUserView = new HeaderUserView();
var campaingDetailView = new CampaingDetailView();