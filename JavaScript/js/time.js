
setInterval(nowTime, 1000);
function nowTime() {
  let now = new Date();
  let hh = now.getHours();
  let mm = now.getMinutes();
  let ss = now.getSeconds();

  if (hh < 10) {
    hh = '0' + hh;
  }
  if (mm < 10) {
    mm = '0' + mm;
  }
  if (ss < 10) {
    ss = '0' + ss;
  }

  document.getElementById('time').textContent = hh + ':' + mm + ':' + ss;
}
