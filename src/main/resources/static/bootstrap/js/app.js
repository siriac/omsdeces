var app=angular.module("oms",['ui.bootstrap', 'ngAnimate', 'checklist-model', 'ngTableToCsv', 'ui.router', 'ngRoute']);
app.config(function($stateProvider,$urlRouterProvider){
    $stateProvider.state("Configuration",{
        url:"/configuration",
        templateUrl:"Confirmation.html",
        controller:"confirmationCTRL"

    });
});

app.controller("controller",function($scope,$http,$location,$state,$window,dataShare){
	$scope.username;
	$scope.password;
	$scope.pfosa;
	$scope.pas;
	$scope.codediscrit;
	$scope.pnot;
	$scope.numiden;
	$scope.airsante;
	$scope.pdiscrit;
	$scope.region="";
	$scope.cat;
	$scope.districts=[];
	$scope.ass=[];
	$scope.persons=[];
	$scope.etablissements=[];
	$scope.maladies=[];
	$scope.mort={
			maladie:[]
	};
	$scope.autrelieu;
	$scope.fosa;
	$scope.hemorragie_ante_partum;
	$scope.hemorragie_du_post_partum;
	$scope.hematome_retro_plaacentaire;
	$scope.rupture_uterine;
	$scope.anomalie;
	$scope.pre_eclampsie;
	$scope.avortement_septique;
	$scope.embolie_amniotique;
	$scope.maladie_cardio_vasculaire;
	$scope.vihSida;
	$scope.anemies_severes;
	$scope.autre_circonstance;
	$scope.paludisme;
	$scope.eclampsie;
	
	$scope.movepage = function() {
		$window.location.href = '/Confirmation.html';
	  };
	  
	$scope.chargeregion = function() {
		$http.get("/allregions")
		.then(function(response){
			$scope.regions = response.data;
		});
	  };
	  $scope.chargerdistrict = function() {
			$http.get("/allDistrictByRegion?regionName="+$scope.region)
			.then(function(response){
				$scope.districts = response.data;
			});
		  };
		  $scope.chargerass = function() {
				$http.get("/allAS")
				.then(function(response){
					$scope.ass = response.data;
				});
			  };
			  $scope.chargerpersons = function() {
					$http.get("/AllPerson")
					.then(function(response){
						$scope.persons = response.data;
					});
				  };
	
				  $scope.chargerMaladies = function() {
						$http.get("/AllMaladie")
						.then(function(response){
							$scope.maladies = response.data;
						});
					  };
					  $scope.chargerEtablisse = function() {
							$http.get("/EtabByDist?codeDistrict="+$scope.codediscrit)
							.then(function(response){
								$scope.etablissements = response.data;
							});
						  };
		
	$scope.today = function() {
    $scope.dt = new Date();
    $scope.dt2 = new Date();
  };
  $scope.today();

  $scope.clear = function() {
    $scope.dt = null;
    $scope.dt2 = null;
  };

  $scope.inlineOptions = {
    customClass: getDayClass,
    minDate: new Date(),
    showWeeks: true
  };

  $scope.dateOptions = {
    dateDisabled: disabled,
    formatYear: 'yy',
    maxDate: new Date(2020, 5, 22),
    minDate: new Date(),
    startingDay: 1
  };

  // Disable weekend selection
  function disabled(data) {
    var date = data.date,
      mode = data.mode;
    return mode === 'day' && (date.getDay() === 0 || date.getDay() === 6);
  }

  $scope.toggleMin = function() {
    $scope.inlineOptions.minDate = $scope.inlineOptions.minDate ? null : new Date();
    $scope.dateOptions.minDate = $scope.inlineOptions.minDate;
  };

  $scope.toggleMin();

  $scope.open1 = function() {
    $scope.popup1.opened = true;
  };

  $scope.open2 = function() {
    $scope.popup2.opened = true;
  };

  $scope.setDate = function(year, month, day) {
    $scope.dt = new Date(year, month, day);
    $scope.dt2 = new Date(year, month, day);
  };

  $scope.formats = ['yyyy-MM-dd' , 'dd-MMMM-yyyy', 'yyyy/MM/dd', 'dd.MM.yyyy', 'shortDate'];
  $scope.format = $scope.formats[0];
  $scope.altInputFormats = ['M!/d!/yyyy'];

  $scope.popup1 = {
    opened: false
  };

  $scope.popup2 = {
    opened: false
  };

  var tomorrow = new Date();
  tomorrow.setDate(tomorrow.getDate() + 1);
  var afterTomorrow = new Date();
  afterTomorrow.setDate(tomorrow.getDate() + 1);
  $scope.events = [
    {
      date: tomorrow,
      status: 'full'
    },
    {
      date: afterTomorrow,
      status: 'partially'
    }
  ];

  function getDayClass(data) {
    var date = data.date,
      mode = data.mode;
    if (mode === 'day') {
      var dayToCheck = new Date(date).setHours(0,0,0,0);

      for (var i = 0; i < $scope.events.length; i++) {
        var currentDay = new Date($scope.events[i].date).setHours(0,0,0,0);

        if (dayToCheck === currentDay) {
          return $scope.events[i].status;
        }
      }
    }

    return '';
  }
	$scope.submitForm = function(){
		
	
		var url = "/SaveAnnexe";
		
		var config = {
                headers : {
                	'Content-Type': 'application/json; charset=UTF-8'
                },
		dataType: 'json'
        }
		var data = {
		region : $scope.region,
 		district : $scope.discrit,
 		categorie : $scope.cat,
 		aire_sante : $scope.airsante,
 		numIden : $scope.numiden,
 		lieuDeces : $scope.fosa,
 		dateDeces : $scope.dt,
 		dateSignature : $scope.dt2,
 		personneNotifie : $scope.pnot,
 		responsableFOSA : $scope.pfosa,
 		responsableAS : $scope.pas,
 		chefDistrict : $scope.pdiscrit,
 		hemorragie_ante_partum: $scope.hemorragie_ante_partum,
 		hemorragie_du_post_partum : $scope.hemorragie_du_post_partum,
 		hematome_retro_plaacentaire : $scope.hematome_retro_plaacentaire,
 		rupture_uterine : $scope.rupture_uterine,
 		anomalie : $scope.anomalie,
 		pre_eclampsie : $scope.pre_eclampsie,
 		avortement_septique : $scope.avortement_septique,
 		embolie_amniotique :$scope.embolie_amniotique,
 		maladie_cardio_vasculaire : $scope.maladie_cardio_vasculaire,
 		vihSida : $scope.vihSida,
 		anemies_severes : $scope.anemies_severes,
 		autre_circonstance : $scope.autre_circonstance,
 		paludisme : $scope.paludisme,
 		eclampsie : $scope.eclampsie
        };
		

		$http.post(url, data, config).then(function (response) {
			dataShare.sendData(response.data);
			$window.location.href = '/Confirmation.html';
		}, function error(response) {
			$scope.postResultMessage = "Error with status: " +  response.statusText;
		});
		
	}
	
	
	$scope.submitFormSave = function(){
		
		
		var url = "/SaveUser";
		
		var config = {
                headers : {
                	'Content-Type': 'application/json; charset=UTF-8'
                },
		dataType: 'json'
        }
		var data = {
		userName : $scope.username,
		password : $scope.password
 		
        };
		

		$http.post(url, data, config).then(function (response) {
			dataShare.sendData(response.data);
			$window.location.href = '/ConfirmationEnregistrement.html';
		}, function error(response) {
			$scope.postResultMessage = "Error with status: " +  response.statusText;
		});
		
	}
	
});
app.controller('getcontroller', function($scope, $http, $location) {
	$scope.getfunction = function(){
		var url = "/AllAnnexe";
		
		$http.get(url).then(function (response) {
			$scope.response = response.data
			
		}, function error(response) {
			
			$scope.postResultMessage = "Error with status: " +  response.statusText;
		});
	}
});

app.controller('confirmationCTRL', function($scope, $http, $location,dataShare,$window) {
	$scope.backtomenu=function(){
		
		$window.location.href = '/Menu.html';
	};
$scope.backtologin=function(){
		
		$window.location.href = '/login.html';
	};
	$scope.$on('data_shared',function(){
	      var data = dataShare.getData();
	});
	$scope.postResultMessage = dataShare.getData();
});

app.controller('loginCTRL',function($scope, $http,$window,$location) {
	$scope.username;
	$scope.password;
	$scope.submitForm = function(){
		$http.get("/Authen?name="+$scope.username+"&password="+$scope.password)
		.then(function(response){
			$scope.persons = response.data;
			$window.location.href = '/Menu.html';
			$scope.Message="Authentification avec succes"
		});
};
});

app.factory('dataShare',function($rootScope,$timeout){
	  var service = {};
	  service.data = false;
	  service.sendData = function(data){
	      this.data = data;
	      $timeout(function(){
	         $rootScope.$broadcast('data_shared');
	      },100);
	  };
	  service.getData = function(){
	    return this.data;
	  };
	  return service;
	});
		
app.directive('datepickerLocaldate', ['$parse', function ($parse) {
    var directive = {
        restrict: 'A',
        require: ['ngModel'],
        link: link
    };
    return directive;

    function link(scope, element, attr, ctrls) {
        var ngModelController = ctrls[0];

        // called with a JavaScript Date object when picked from the datepicker
        ngModelController.$parsers.push(function (viewValue) {
            console.log(viewValue);console.log(viewValue);console.log(viewValue);
            // undo the timezone adjustment we did during the formatting
            viewValue.setMinutes(viewValue.getMinutes() - viewValue.getTimezoneOffset());
            // we just want a local date in ISO format
            return viewValue.toISOString().substring(0, 10);
        });
    }
}]);


