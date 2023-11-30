package edu.ncsu.csc.iTrust2.controllers.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.ncsu.csc.iTrust2.forms.PersonalRepresentativeForm;
import edu.ncsu.csc.iTrust2.models.PersonalRepresentative;
import edu.ncsu.csc.iTrust2.models.User;
import edu.ncsu.csc.iTrust2.services.PatientService;
import edu.ncsu.csc.iTrust2.services.PersonalRepresentativeService;
import edu.ncsu.csc.iTrust2.services.UserService;
import edu.ncsu.csc.iTrust2.utils.LoggerUtil;
import java.util.List;
// import io.swagger.annotations.Api;

import org.springframework.http.HttpStatus;

// @Api(tags = { "API 정보를 제공하는 Controller" })
// @RequestMapping("/api")
@RestController
@SuppressWarnings({ "rawtypes", "unchecked" })
public class APIPersonalRepresentativeController extends APIController {

  @Autowired
  private LoggerUtil loggerUtil;

  @Autowired
  private PersonalRepresentativeService personalRepresentativeService;

  @Autowired
  private PatientService patientService;

  @Autowired
  private UserService userService;

  @PostMapping(BASE_PATH +
      "/personal_representetives/assign/assignee/{assingeePatientMID}")
  public ResponseEntity assignAssignee(@RequestBody PersonalRepresentativeForm form) {
    try {
      final PersonalRepresentative personalRepresentative = new PersonalRepresentative(form);

      final User self = userService.findByName(LoggerUtil.currentUser());
      personalRepresentative.setAssignor(self.getUsername());
      personalRepresentativeService.save(personalRepresentative);

      return new ResponseEntity(personalRepresentative, HttpStatus.OK);

    } catch (final Exception e) {
      return new ResponseEntity(
          errorResponse("Error: " + e.getMessage()),
          HttpStatus.BAD_REQUEST);
    }
  }

  @PostMapping(BASE_PATH +
      "/personal_representetives/assign/assignor/{assingorPatientMID}")
  public ResponseEntity assignAssignor(@RequestBody PersonalRepresentativeForm form) {
    try {
      final PersonalRepresentative personalRepresentative = new PersonalRepresentative(form);

      final User self = userService.findByName(LoggerUtil.currentUser());
      personalRepresentative.setAssignee(self.getUsername());
      personalRepresentativeService.save(personalRepresentative);

      return new ResponseEntity(personalRepresentative, HttpStatus.OK);

    } catch (final Exception e) {
      return new ResponseEntity(
          errorResponse("Error: " + e.getMessage()),
          HttpStatus.BAD_REQUEST);
    }
  }

  @GetMapping(BASE_PATH +
      "/personal_representetives/view/assignee")
  public ResponseEntity viewAssignee() {
    final User self = userService.findByName(LoggerUtil.currentUser());

    final List<PersonalRepresentative> assignorAssigneePair = personalRepresentativeService
        .findByAssginorContains(self.getUsername());

    return ResponseEntity.ok(assignorAssigneePair);
  }

  @GetMapping(BASE_PATH +
      "/personal_representetives/view/assignor")
  public ResponseEntity viewAssignor() {
    final User self = userService.findByName(LoggerUtil.currentUser());

    final List<PersonalRepresentative> assigneeAssignorPair = personalRepresentativeService
        .findByAssgineeContains(self.getUsername());

    return ResponseEntity.ok(assigneeAssignorPair);
  }
}
