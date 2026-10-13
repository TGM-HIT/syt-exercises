document$.subscribe(function () {
  function sendHeight() {
    const height = Math.ceil(document.body.getBoundingClientRect().height);
    window.parent.postMessage({ height }, "*");
  }

  sendHeight();
  new ResizeObserver(sendHeight).observe(document.body);

  document.querySelectorAll("details").forEach((el) => {
    el.addEventListener("toggle", () => requestAnimationFrame(sendHeight));
  });
});
