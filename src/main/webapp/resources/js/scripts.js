///////////////////////////////////////////////////////
//JavaScript program for birth date on userSetup page//
///////////////////////////////////////////////////////

var month = {
   1 : "Jan",
   2 : "Feb",
   3 : "Mar",
   4 : "Apr",
   5 : "May",
   6 : "June",
   7 : "July",
   8 : "Aug",
   9 : "Sept",
   10 : "Oct",
   11 : "Nov",
   12 : "Dec"
};

function populateMonth(){
  var select = document.getElementById("monthDrop");
  for(index in month) {
      select.options[select.options.length] = new Option(month[index], index);
  }
}

function populateYear(){
  var select = document.getElementById("yearDrop");
  var date = new Date();
  var year = date.getFullYear();
  for(i = year; i >= 1900; i--) {
      select.options[select.options.length] = new Option(i, i);
  }
}

function setDaysValue(monthId, yearId){
	deleteDays();
    date = new Date(document.getElementById(yearId).value, document.getElementById(monthId).value, 0).getDate();
    var select = document.getElementById("dayDrop");
    for(i = 1; i <= date; i++) {
	select.options[select.options.length] = new Option(i, i);
    }
}
 
function deleteDays(){
	  var select = document.getElementById("dayDrop");
	  var length = select.options.length;
	  for (i = length-1; i >= 0; i--) {
	    select.options[i] = null;
	  }
	}

/////////////////////////////
//jQuery for userSetup page// 
/////////////////////////////

$("#planForm :input").attr("disabled", true);
$("#planForm").hide();

$("#trackerRadio").on("click", function() {
	$("#planForm, .fadeBtn").fadeOut(750);
	$("#planForm :input").attr("disabled", true);
	$(".fadeBtn").fadeIn(1000);
});

$("#planRadio").on("click", function() {
	$(".fadeBtn").fadeOut(500).fadeIn(500);
	$("#planForm").delay(500).fadeIn(1000);
	$("#planForm :input").removeAttr("disabled");
});

////////////////////////
//jQuery for home page//
////////////////////////

$(document).ready(function(){ 
	$(".btnFadeTop, .btnFadeBot").hide();
	$("#welcomeFade").hide().delay(1000).fadeIn(1500);
	$(".btnFadeTop").delay(2500).fadeIn(1000);
	$(".btnFadeBot").delay(3500).fadeIn(1000);
});

$(".footerLogo").on("click", function() {
	$(".footerLogo").toggleClass("animated rubberBand");
});

////////////////////
//Called functions//
////////////////////

populateMonth();
populateYear();
setDaysValue("monthDrop", "yearDrop");

