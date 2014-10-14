'use strict';

/* Filters */

angular.module('myApp.filters', []).
    filter('checkFound', function() {
        return function(found) {
            return found ? 'found' : 'not-found';
        };
    });