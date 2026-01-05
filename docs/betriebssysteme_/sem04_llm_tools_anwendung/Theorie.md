## Relevant Concepts

- AGI (Artificial General Intelligence): A hypothetische Form von KI, die – ähnlich wie ein Mensch – allgemeine kognitive Fähigkeiten besitzt und Wissen flexibel auf neue, unbekannte Aufgaben übertragen kann (nicht nur für eine eng definierte Domäne). AGI würde u. a. durch **Transferlernen**, **robustes Schlussfolgern**, **Planung** und **Autonomie** in sehr unterschiedlichen Kontexten gekennzeichnet sein. _Abgrenzung:_ heutige LLMs gelten i. d. R. als „narrow AI“ (spezialisierte Systeme), da sie trotz breiter Sprachkompetenz keine verlässliche, allgemeine Problemlösefähigkeit mit garantierter Zielorientierung besitzen.
- Prompting (standard input): Supplying a text query or instruction to an LLM so it generates a relevant continuation or answer.
- Temperature (creativity): A sampling parameter (T≥0) that smooths or sharpens the output distribution; higher T→more diverse/creative (and noisier) text, lower T→more deterministic.
- Jailbreaking: Designing prompts to bypass an LLM’s safety or policy filters, coercing disallowed content. https://gandalf.lakera.ai/baseline
- Hallucination: When an LLM generates plausible-looking but false or ungrounded statements.
- System Prompt: A hidden or high-priority instruction layer that sets the assistant’s role, rules, and boundaries (e.g., style, safety constraints, allowed tools). It guides all responses and typically cannot be altered by normal user input.
- Token: The basic unit an LLM processes and generates (roughly parts of words). Input and output length are measured in tokens, which affects cost, latency, and how much text fits into a single request.
- Context Window: The maximum number of tokens the model can “see” at once (prompt + conversation history + retrieved documents + generated output). If the content exceeds this limit, older parts may be truncated or ignored. Depending on the Model: 4k up to 200k+
- Memory: Mechanisms to retain information beyond the current context window. This can be session-based (conversation history within the context) or persistent (stored user preferences/facts saved across sessions), depending on the system and settings.
- Zero-shot prompting (0-shot): Asking an LLM to perform a task without providing any examples—only an instruction (and ggf. Kontext/Format). The model relies solely on its general training to infer what is expected.
- Few-shot prompting (few-shot): Asking an LLM to perform a task while providing a small number of input–output examples (typisch 1–5) in the prompt. These examples demonstrate the desired pattern (e.g., style, structure, labels), improving reliability and consistency compared to zero-shot prompting.
  - **Beispiele:**
    - _Zero‑shot:_ „Klassifiziere diese E‑Mail als Spam oder Nicht‑Spam: …“
    - _Few‑shot:_ „Beispiel 1: … → Spam; Beispiel 2: … → Nicht‑Spam; Jetzt: … → ?“
