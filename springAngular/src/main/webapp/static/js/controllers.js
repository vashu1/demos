'use strict';

/* Controllers */

angular.module('myApp.controllers', []).
    controller('AppCtrl', function ($scope, $http, $log) {
        $scope.params = {
            title: 'site title',
            rest: {}
        };

        $http.get('/springAngular/rest/item/list').
            success(function (data, status, headers, config) {
                $scope.params.rest = data;
            }).
            error(function (data, status, headers, config) {
                $log.error('rest get error')
        });

        $http({
            method: 'GET',
            url: '/api/name'
        }).
            success(function (data, status, headers, config) {
                $scope.name = data.name;
            }).
            error(function (data, status, headers, config) {
                $scope.name = 'Error!';
            });
    }).
    controller('MyCtrl1', function ($scope, $http) {
        $http.get('/api/peoples').success(function (data) {
            $scope.peoples = data;
        });

        $scope.random = function () {
            return 0.5 - Math.random();
        };

        $scope.query = '';

        $scope.checkQuery = function (query) {
            console.log('Query: ' + query);
        };
    }).
    controller('MyCtrl2', function ($scope, $location) {
        $scope.master = {};

        $scope.update = function(user) {
            $scope.master = angular.copy(user);
            alert(JSON.stringify(user));
        };

        $scope.reset = function() {
            $scope.user = angular.copy($scope.master);
        };

        $scope.lies = {
            prop1: 'one',
            prop2: 'two',
            prop3: 'three'
        };

        $scope.reset();
    }).
    controller('UIRouteController', function ($scope, $location) {
        $scope.master = {};

        $scope.update = function(user) {
            $scope.master = angular.copy(user);
            alert(JSON.stringify(user));
        };

        $scope.reset = function() {
            $scope.user = angular.copy($scope.master);
        };

        $scope.reset();
    });
