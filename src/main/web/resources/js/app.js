'use strict';

var AngularSpringmvcMybatis = {};

var App = angular.module('AngularSpringmvcMybatis',
    ['AngularSpringmvcMybatis.filters',
        'AngularSpringmvcMybatis.services',
        'AngularSpringmvcMybatis.directives']);

var loginApp = angular.module('loginApp', []);
loginApp.controller('loginController', function ($scope, $http) {
    $scope.login = function () {
        $http({
            method: "post",
            url: "/users/login",
            params: {
                "userName": $scope.userName,
                "password": $scope.password
            }
        }).success(function (data) {
            if (data.success) {
                alert("登录成功");
            } else {
                alert("登入失败");
            }
        }).error(function () {

        });
    }

})

// Declare app level module which depends on filters, and services
App.config(['$routeProvider', function ($routeProvider) {
    $routeProvider.when('/users', {
        templateUrl: 'users/layout.html',
        controller: UserController
    });

    $routeProvider.otherwise({redirectTo: '/users'});
}]);
