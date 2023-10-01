const GetNum = document.querySelectorAll('.calculator input[type="button"]');
const resultField = document.getElementById('result');

GetNum.forEach(num => {
  num.addEventListener('click', function(e) {
    let numvalue = e.target.value;
    resultField.value += numvalue;
  });
});

function ClearAll(){
    resultField.value = null;
}

