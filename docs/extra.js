document.addEventListener('DOMContentLoaded', () => {
  const btn = document.createElement('button');
  btn.id = 'chrome-toggle-btn';
  btn.setAttribute('aria-label', 'Navigation ein-/ausblenden');
  btn.innerHTML = `
    <svg viewBox="0 0 24 24">
      <path d="M3 6h18v2H3zm0 5h18v2H3zm0 5h18v2H3z"/>
    </svg>
  `;
  document.body.appendChild(btn);

  btn.addEventListener('click', () => {
    document.body.classList.toggle('show-chrome');
  });
});