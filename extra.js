(function () {
  const STORAGE_KEY = "chrome-visible";

  // Zustand so früh wie möglich anwenden, um Flackern beim Laden zu vermeiden
  const isVisible = localStorage.getItem(STORAGE_KEY) === "true";
  if (isVisible) {
    document.documentElement.classList.add("show-chrome");
  }

  document.addEventListener("DOMContentLoaded", () => {
    const btn = document.createElement("button");
    btn.id = "chrome-toggle-btn";
    btn.setAttribute("aria-label", "Navigation ein-/ausblenden");
    btn.innerHTML = `
      <svg viewBox="0 0 24 24">
        <path d="M3 6h18v2H3zm0 5h18v2H3zm0 5h18v2H3z"/>
      </svg>
    `;
    document.body.appendChild(btn);

    btn.addEventListener("click", () => {
      const nowVisible =
        document.documentElement.classList.toggle("show-chrome");
      localStorage.setItem(STORAGE_KEY, nowVisible);
    });
  });
})();
