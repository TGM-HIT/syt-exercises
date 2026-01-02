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

## Effective Prompting

For generalized prompting we can use a simple seven-step framework that is serviceable in most educational settings that entails assigning the LLM with a Role, Task, Context, Exemplar, Focus, Format and Tone.

---

1. Role assignment
   Assign a role to the LLM to fulfill the task you have in mind. This can range from an expert in a discipline to a specific individual. For instance you can input either “You will be acting as a professional physicist” or “You will be acting as Einstein.” It is recommended to immediately provide any adjustments to that personality, e.g. “You will be acting as a meticulous, detail-oriented, and supportive English professor for students between the ages of 12 and 18.”
2. Task
   Clearly articulate the specific task or objective you want to achieve. This should be direct and unambiguous, leaving no room for interpretation about the desired outcome. For instance, instead of saying e.g. "Please help with writing," specify "Please write a 500-word newspaper article appropriate for CEFR B2 language learners on architecture."
3. Context
   Provide background information or the broader setting of your request. This includes the purpose behind the task (e.g., educational, professional), the intended audience (e.g., experts, general public), and any constraints (e.g., deadline, word limit). Context helps tailor the response more precisely to your needs,e.g. "Please write a 500-word newspaper article on architecture for use in creating a reading comprehension exercise for third year students at an Austrian Allgemeinbildende Höhere Schule/Academic Secondary School."
4. Exemplar
   Offering an example or model can guide the desired output's structure, content, or tone. This could be a link to a similar work, a brief outline, key points to cover, or an actual example pasted into the prompt. Exemplars serve as a concrete benchmark for the expected result.
5. Specific focus
   This involves specifying any personal preferences, needs, or interests that could influence the response. For instance, if you have a preference for certain methodologies, terminologies, or conceptual frameworks, stating these can lead to more personalized and relevant responses.
6. Format
   Define the structural requirements of the output, including length (word count, number of pages), terminology (simple, technical), language (formal, informal), style (APA, MLA), and text type (article, essay, report, narrative). Clear format guidelines ensure that the output meets specific presentation or publication standards.
7. Tone
   The tone involves the emotional quality or attitude conveyed in the response. It could range from professional, enthusiastic, skeptical, to humorous. Defining the tone is particularly important when the output is meant for communication or educational purposes, as it sets the mood and influences the reader's engagement.

---

### Meta Prompting

Please create a sample prompt by adapting the following prompting guidelines to [insert ]. Here are the prompting guidelines to apply: [enter the text above].
