document$.subscribe(function() {
  function sendHeight() {
    window.parent.postMessage({ height: document.documentElement.scrollHeight }, '*');
  }
  sendHeight();
  new ResizeObserver(sendHeight).observe(document.body);
});